SUMMARY = "Simple Framework"
DESCRIPTION = "The goal of Simple is to bring simplicity, scalability, and performance to \
server side Java. The primary focus of the project is to provide a truly \
embeddable Java based HTTP and WebSocket engine capable of handling enormous \
loads. Simple provides a truly asynchronous service model, request completion \
is driven using an internal, transparent, monitoring system. This allows Simple \
to vastly outperform most popular Java based servers in a multi-tier \
environment, as it requires only a very limited number of threads to handle \
very high quantities of concurrent clients. Simple has consistently out \
performed both commercial and open source Java Servlet engines and WebSocket \
platforms and has a fully comprehensive API that is as usable for experienced \
Java developers as it is for beginners. Best of all, Simple is completely free, \
and is released under the terms of the Apache License, which ensures its \
availability for use by open source and proprietary developers alike."
LICENSE = "Apache-2.0"

PV = "6.0.1"

RPM_NAME = "simpleframework-6.0.1-2.4.noarch.rpm"
RPM_HASH = "46dcd33f0bf05465391ed5d824b825ba42c267737167c1125a94cd488696ac8b65397ba0d59545340e7e5ad27c4c453c1cfb8ecb17a86e2421bad64b01264175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.simpleframework-simple-common \
mvn-org.simpleframework-simple-common-pom- \
mvn-org.simpleframework-simple-http \
mvn-org.simpleframework-simple-http-pom- \
mvn-org.simpleframework-simple-pom- \
mvn-org.simpleframework-simple-transport \
mvn-org.simpleframework-simple-transport-pom- \
simpleframework"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
