SUMMARY = "Network services database access for java"
DESCRIPTION = "jnr-netdb is a java interface to getservbyname(3), getservbyport(3). \
 \
It tries to use the native functions if possible, falling back to parsing \
/etc/services directly, and finally to an inbuilt table for use in environments \
where neither native code, nor filesystem access is possible."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "jnr-netdb-1.2.0-1.23.noarch.rpm"
RPM_HASH = "a0add69de8fc676002da6c9114be04569eaddc909b92a1d5064b0e96a2529d3918dc2464d7632430b7ba08fba349a7080d5194e4610fe0ad02ee722c9b276f5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-netdb \
mvn-com.github.jnr-jnr-netdb \
mvn-com.github.jnr-jnr-netdb-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.jnr-jnr-ffi"

inherit rpm
