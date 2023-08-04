FROM maven:3.8.6-openjdk-8
WORKDIR /Users/Arman/eclipse-workspace/Mavenproject/src
COPY . .
CMD ["mvn", "clean", "test"]