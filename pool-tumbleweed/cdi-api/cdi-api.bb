SUMMARY = "Contexts and Dependency Injection for Java EE"
DESCRIPTION = "APIs for JSR-299: Contexts and Dependency Injection for Java EE"
LICENSE = "Apache-2.0"

PV = "2.0.2"

RPM_NAME = "cdi-api-2.0.2-5.10.noarch.rpm"
RPM_HASH = "7aba6f91b8de3e6d14993e2623e9159f141aa7db432c69cc28e5f48597401b4f9a194d204c0041e763ba8e7d3a388e7aa17eb21cce896c34142766cb74f6d631"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cdi-api \
mvn-jakarta.enterprise-jakarta.enterprise.cdi-api \
mvn-jakarta.enterprise-jakarta.enterprise.cdi-api-pom- \
mvn-javax.enterprise-cdi-api \
mvn-javax.enterprise-cdi-api-pom- \
osgi-jakarta.enterprise.cdi-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.inject-javax.inject \
mvn-org.jboss.spec.javax.interceptor-jboss-interceptors-api-1.2-spec"

inherit rpm
