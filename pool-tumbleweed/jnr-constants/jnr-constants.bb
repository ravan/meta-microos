SUMMARY = "Java Native Runtime constants"
DESCRIPTION = "This project contains Java enums for common POSIX constants. It is \
predominately used to make calls into jnr-posix far simpler."
LICENSE = "Apache-2.0"

PV = "0.10.4"

RPM_NAME = "jnr-constants-0.10.4-2.10.noarch.rpm"
RPM_HASH = "5893cd41109fe167f0836485a20dc70f1d4c2772a5f66db24a77ed07982c28494eec7074867ad6152e630698108e697ed445b1d62e9f841cb03fac717df7b8db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-constants \
mvn-com.github.jnr-jnr-constants \
mvn-com.github.jnr-jnr-constants-pom- \
osgi-com.github.jnr.constants"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
