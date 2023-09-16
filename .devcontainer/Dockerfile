FROM eclipse-temurin:latest

RUN apt-get update

RUN wget https://dlcdn.apache.org/maven/maven-3/3.9.4/binaries/apache-maven-3.9.4-bin.tar.gz \
    && tar -xvf apache-maven-3.9.4-bin.tar.gz \
    && mv apache-maven-3.9.4 /opt/ \
    && echo 'export PATH=/opt/apache-maven-3.9.4/bin:$PATH' >> ~/.bashrc \
    && rm -r apache-maven-3.9.4-bin.tar.gz

RUN curl -Ls https://sh.jbang.dev | bash -s - trust add https://repo1.maven.org/maven2/io/quarkus/quarkus-cli/ \
    && curl -Ls https://sh.jbang.dev | bash -s - app install --fresh --force quarkus@quarkusio

CMD ["tail", "-f", "/dev/null"]