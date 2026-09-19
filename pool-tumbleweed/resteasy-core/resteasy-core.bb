SUMMARY = "Core modules for resteasy"
DESCRIPTION = " \
RESTEasy contains a JBoss project that provides frameworks to help \
build RESTful Web Services and RESTful Java applications. It is a fully \
certified and portable implementation of the JAX-RS specification. \
 \
This package contains Core modules for resteasy."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-core-3.0.26-4.17.noarch.rpm"
RPM_HASH = "ed36a9e70a6de9859454a44106d63fa8153dafcc8ffda28bcdf6e20926d6f34505287eb2d6071b7df9347f38b7f2ec180a674f101f6ba31b958c3688a985bb84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jboss.resteasy-providers-pom-pom- \
mvn-org.jboss.resteasy-resteasy-jaxrs \
mvn-org.jboss.resteasy-resteasy-jaxrs-all-pom- \
mvn-org.jboss.resteasy-resteasy-jaxrs-pom- \
resteasy-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-javax.activation-activation \
mvn-javax.xml.bind-jaxb-api \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.tomcat-tomcat-servlet-api \
mvn-org.jboss.logging-jboss-logging \
mvn-org.jboss.logging-jboss-logging-annotations \
mvn-org.jboss.logging-jboss-logging-processor \
mvn-org.jboss.spec.javax.annotation-jboss-annotations-api-1.2-spec \
mvn-org.jboss.spec.javax.ws.rs-jboss-jaxrs-api-2.0-spec"

inherit rpm
