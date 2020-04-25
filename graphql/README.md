# GraphQL

1.创建test数据库
2.启动运行程序
访问http://localhost:8080/graphiql

3.接口访问(详细可看https://my.oschina.net/hanchao/blog/3014116)
mutation{
  newAuthor(firstName: "树人",lastName: "周"){
    firstName 
    lastName 
  }
  
  newBook(title: "《狂人日记》",isbn: "鲁迅的书",pageCount: 100, authorId: 1){
    id
    title
    isbn
    pageCount
    author {
      id
    }
  }
}

