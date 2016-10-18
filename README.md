# Bootique demo application

This is demo for blog post: [Bootique: a Minimally Opinionated Platform for Modern Java Apps](Bootique: a Minimally Opinionated Platform for Modern Java Apps)

You can import project run samples into IDE, or use command line:

```bash
# build project
maven clean package

# run
java -jar target/bootique-demo-0.20.jar
# or
java -jar target/bootique-demo-0.20.jar --help

# say hello
java -jar target/bootique-demo-0.20.jar --hello --config=my.yml
# or
java -jar target/bootique-demo-0.20.jar --hello --config my.yml
```



