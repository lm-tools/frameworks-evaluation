# Short evaluation of frameworks

Main points to consider:
- Is it quick to prototype
- Short learning curve
- Stability of ecosystem
- Maintainability
- Can it be used by designers
- Is it FUN

## Jvm based

* [Play 2](https://playframework.com/)
* [Spark](http://sparkjava.com/)
* [Grails 3](https://grails.org/)

### Play 2

Example [here](play-java-intro)

Findings:
- supports java and scala
- builds on sbt
- run on netty (event driven)
- template engine [twirl](https://www.playframework.com/documentation/2.5.x/ScalaTemplates)
    - typesafe
    - composable
- templates that can be unit tested
- default orm is jpa
- support for schema migrations with 'evolutions'

New project setup

    $ sdk install activator
    $ activator new
    $ activator run ( or actitvator ui )


Resources:
- [short java tutorial](https://www.youtube.com/watch?v=bLrmnjPQsZc)
- [linkedin comparison with nodejs](https://www.youtube.com/watch?v=b6yLwvNSDck)
- [activator templates](https://www.lightbend.com/activator/templates)

### Spark

Example [here](spark)

Minimalistic - similar to sinatra.


### Grails 3

Example [here](grails-app)

Ruby on rails in groovy.

Findings:
- based on spring boot and spring mvc
- orm based on hibarnate
- template engine is 'gsp'
- run on gradle
