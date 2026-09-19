SUMMARY = "Maven Plugin Testing Mechanism"
DESCRIPTION = "Maven is a software project management and comprehension tool. Based on the \
concept of a project object model (POM), Maven can manage a project's build, \
reporting and documentation from a central piece of information."
LICENSE = "Apache-2.0 & MIT"

PV = "4.0.0~rc6"

RPM_NAME = "maven4-bootstrap-4.0.0~rc6-2.1.aarch64.rpm"
RPM_HASH = "819c06002dced79e7af9432b6c78ce465e4cd451d11309fe8cc4be76451b3ff77c5c7e9cb4a08464c791a79dc89103752946a89d1e3b44c3854d18a2dd7d75a0"

RPROVIDES:${PN} += "maven4-bootstrap \
mvn-org.apache.maven-maven-api-annotations \
mvn-org.apache.maven-maven-api-annotations-pom- \
mvn-org.apache.maven-maven-api-xml \
mvn-org.apache.maven-maven-api-xml-pom- \
mvn-org.apache.maven-maven-xml \
mvn-org.apache.maven-maven-xml-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.woodstox-woodstox-core \
mvn-org.codehaus.woodstox-stax2-api"

inherit rpm
