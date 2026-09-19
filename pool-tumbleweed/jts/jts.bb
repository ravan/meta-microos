SUMMARY = "Java Topology Suite"
DESCRIPTION = "The LocationTech JTS Topology Suite (JTS) is an open source Java software \
library that provides an object model for planar geometry together with a \
set of fundamental geometric functions. JTS conforms to the Simple Features \
Specification for SQL published by the Open GIS Consortium.  JTS is designed \
to be used as a core component of vector-based geomatics software such as \
geographical information systems. It can also be used as a general-purpose \
library providing algorithms in computational geometry."
LICENSE = "EPL-1.0"

PV = "1.20.0"

RPM_NAME = "jts-1.20.0-1.6.noarch.rpm"
RPM_HASH = "f25f9bbc00b35927f310914a4e34d81789b1c28dd5e5ad7427cac21da12f07ddc6586d0e685d98c59f6d19259ec8a89959531fb60fd92c7da80d5330f8364961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jts \
mvn-com.vividsolutions-jts \
mvn-com.vividsolutions-jts-core \
mvn-com.vividsolutions-jts-core-pom- \
mvn-com.vividsolutions-jts-pom- \
mvn-org.locationtech.jts-jts-core \
mvn-org.locationtech.jts-jts-core-pom- \
osgi-org.locationtech.jts.jts-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
