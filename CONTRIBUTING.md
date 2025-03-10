## Contributing to Apache Camel
First of all, thank you for having an interest in contributing to Apache Camel.
If this is your first contribution to Camel, please review [the guidelines for contributing to Camel and its related projects](https://camel.apache.org/community/contributing/).

Then follow these simple guidlines for working on the code and committing your changes.

- Fork and then clone the github camel repository:

    git clone https://github.com/Zurich-Insurance/camel/camel.git

- Build the project using maven:

    mvn clean install -Pfastinstall

- Add a unit test with assertions for your changes.

- Run checkstyle using the sourcecheck profile in maven:

    mvn clean install -Psourcecheck

- Check the documentation (.adoc file) for the code which you have modified and update it if required. For example if you have added or modified a component, the documentation file is in the src/main/docs folder.

- Write a commit messsage which references the related JIRA or Github issue and includes some detail of your changes.
- Push to your fork and create a pull request.
- Stay engaged, follow and respond to comments or questions you might be asked by the Camel team.

