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

RPM_NAME = "avalon-framework-4.3-8.2.noarch.rpm"
RPM_HASH = "f512c79c7bb2923538d5a3687b51382746a2d94200fbac935b74bb14fe8f97f5e89b1face60fc62fdb202226ca52db3195b66717d7d2284e201d9ae6ee2572b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avalon-framework \
mvn-avalon-framework-avalon-framework \
mvn-avalon-framework-avalon-framework-impl \
mvn-avalon-framework-avalon-framework-impl-pom- \
mvn-avalon-framework-avalon-framework-pom- \
mvn-org.apache.avalon.framework-avalon-framework-impl \
mvn-org.apache.avalon.framework-avalon-framework-impl-pom- \
osgi-avalon-framework-impl-4.3"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-avalon-framework-avalon-framework-api \
mvn-avalon-logkit-avalon-logkit"

inherit rpm
