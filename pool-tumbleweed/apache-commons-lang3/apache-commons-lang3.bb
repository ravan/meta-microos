SUMMARY = "Apache Commons Lang Package"
DESCRIPTION = "The standard Java libraries fail to provide enough methods for \
manipulation of its core classes. The Commons Lang Component provides \
these extra methods. \
 \
The Commons Lang Component provides a host of helper utilities for the \
java.lang API, notably String manipulation methods, basic numerical \
methods, object reflection, creation and serialization, and System \
properties. Additionally it contains an inheritable enum type, an \
exception structure that supports multiple types of nested-Exceptions \
and a series of utilities dedicated to help with building methods, such \
as hashCode, toString and equals."
LICENSE = "Apache-2.0"

PV = "3.20.0"

RPM_NAME = "apache-commons-lang3-3.20.0-1.3.noarch.rpm"
RPM_HASH = "13b9e6b77a91295ed6f17011d1bdfa696bc9c25a5e6eaea62b64c08d32aaedba28419c177591af5372b9deb152410200f48bb48d74894d2005963f31f4a5f923"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-lang3 \
commons-lang3 \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.commons-commons-lang3-pom- \
osgi-org.apache.commons.lang3"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
