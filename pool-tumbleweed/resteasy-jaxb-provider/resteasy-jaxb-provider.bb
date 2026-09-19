SUMMARY = "Module jaxb-provider for resteasy"
DESCRIPTION = " \
RESTEasy contains a JBoss project that provides frameworks to help \
build RESTful Web Services and RESTful Java applications. It is a fully \
certified and portable implementation of the JAX-RS specification. \
 \
This package contains Module jaxb-provider for resteasy."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-jaxb-provider-3.0.26-4.17.noarch.rpm"
RPM_HASH = "80bd7a4ba8962cfdf1aea4fb9b5157422531171f5a8f323faf26046cc1b6ad768c9509427baf38e5d7c294af491d77bdd56f775719437589d0857fac000f6663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jboss.resteasy-resteasy-jaxb-provider \
mvn-org.jboss.resteasy-resteasy-jaxb-provider-pom- \
resteasy-jaxb-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.bind-jaxb-impl \
mvn-javax.xml.bind-jaxb-api \
mvn-org.apache.tomcat-tomcat-servlet-api \
mvn-org.jboss.logging-jboss-logging \
mvn-org.jboss.logging-jboss-logging-annotations \
mvn-org.jboss.logging-jboss-logging-processor"

inherit rpm
