SUMMARY = "Java components interfaces"
DESCRIPTION = "The Avalon framework consists of interfaces that define relationships \
between commonly used application components, best-of-practice pattern \
enforcements, and several lightweight convenience implementations of the \
generic components. \
What that means is that we define the central interface Component. We \
also define the relationship (contract) a component has with peers, \
ancestors and children."
LICENSE = "Apache-2.0"

PV = "4.3"

RPM_NAME = "avalon-framework-api-4.3-8.3.noarch.rpm"
RPM_HASH = "f6aa9f18e9fc7447c4babacfde507b0cdacc85bc72367535a227fd98ab33c113d00b51549595166b0bc01ef4a810794de6bfd7249b525a09bb39729c988288c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avalon-framework-api \
mvn-avalon-framework-avalon-framework-api \
mvn-avalon-framework-avalon-framework-api-pom- \
mvn-org.apache.avalon.framework-avalon-framework-api \
mvn-org.apache.avalon.framework-avalon-framework-api-pom- \
osgi-avalon-framework-api-4.3"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-avalon-logkit-avalon-logkit"

inherit rpm
