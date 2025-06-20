
import { useEffect, useState } from 'react';
import './App.css';
import CategoryFilter from './CategoryFilter';
import ProductList from './ProductList';

function App() {

  const [products,setProducts] = useState([]);
  const [categories,setCategories] = useState([]);
  const [selectedCategory,setSelectedCategory] = useState(null);
  const [searchTerm,setSearchTerm] = useState("");
  const [sortOrder,setSortOrder] = useState("asc");

  useEffect(()=>{
    fetch('http://localhost:8080/storefront/product/get-all')
    .then(Response => Response.json())
    .then(data => setProducts(data));


     fetch('http://localhost:8080/storefront/category/all')
    .then(Response => Response.json())
    .then(data => setCategories(data));


  },[])


  const handleSearchChange = (event) =>{
    setSearchTerm(event.target.value)
  };


   const handleSortChange = (event) =>{
    setSortOrder(event.target.value)
  };


   const handleCategorySelect = (categoryId) =>{
    setSelectedCategory(categoryId ? Number(categoryId): null);
  };


  const filteredProducts = products.filter(products =>{
    return (selectedCategory ? products.category.id===selectedCategory : true)
    && 
    products.name.toLowerCase().includes(searchTerm.toLowerCase());

  }).sort((a,b)=>{
    if(sortOrder === "asc"){
      return a.price - b.price;
    }else{
      return b.price - a.price;
    }
  });

  
  return (
    <div className='container'>

      <h1 className='my-4'>Product Catalog</h1>

      <div className='row align-items-center mb-4'>

        <div className='col-md-3 col-sm-12 mb-2'>

        <CategoryFilter categories={categories} onSelect={handleCategorySelect}/>

        </div>

        <div className='col-md-5 col-sm-12 mb-2'>

          <input type="text" className='form-control'
          placeholder='Search for Product' 
          
          onChange={handleSearchChange}/>

        </div>

        <div className='col-md-4 col-sm-12 mb-2'>
          <select className="form-control" onChange={handleSortChange}>
          <option value="asc"> Sort By Price: Low to High</option>
          <option value="desc"> Sort By Price: High to Low</option>
          </select>
        </div>

      </div>

      <div>

        {filteredProducts.length ? (

        //Display products
            <ProductList products={filteredProducts}/>
          ) :
        
        ( <p>No products found</p>)  }
      </div>



    </div>
  )
}

export default App
