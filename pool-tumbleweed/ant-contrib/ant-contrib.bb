SUMMARY = "Collection of tasks for Ant"
DESCRIPTION = "The Ant-Contrib project is a collection of tasks (and at one point \
maybe types and other tools) for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.0b3"

RPM_NAME = "ant-contrib-1.0b3-12.10.noarch.rpm"
RPM_HASH = "e8ed5a660a711372b90819ef3eddd7b4f8b86c0897397a607fc5df70b52e32937eeae81f56f8d5af51607aff90ee4a23a1d546d072996c5823d021c65628adef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-contrib \
config-ant-contrib \
mvn-ant-contrib-ant-contrib \
mvn-ant-contrib-ant-contrib-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
junit \
mvn-org.apache.ant-ant \
xerces-j2"

inherit rpm
