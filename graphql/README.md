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

query{
  findAuthorById(id:1){
    id
    firstName
    books{
      id
      title
    }
  }
  
  findAllBooks{
    id
    title
  }
}

//带参数的查询 {"authorId": 1}
query getAutho($authorId: Long!) {
  findAuthorById(id: $authorId) {
    id
    firstName
    books {
      id
      title
    }
  }
}

//自定义输入类型
mutation($input:BookInput!){
  saveBook(input:$input){
    id
    title
    pageCount
    author{
      id
      firstName
      books{
        title
      }
    }
  }
}

{
  "input": {
		"authorId": 1,
    "title": "《朝花夕拾》",
    "isbn": "散文",
    "pageCount": 900
	}
}

