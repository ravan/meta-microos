SUMMARY = "Apache Felix Gogo command line shell for OSGi"
DESCRIPTION = "Apache Felix Gogo is a subproject of Apache Felix implementing a command \
line shell for OSGi. It is used in many OSGi runtimes and servers."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "felix-gogo-runtime-1.1.6-1.10.noarch.rpm"
RPM_HASH = "64891eb41e431c6efa988b4bac7af16858f596d369d1852f9421de77863256428fed6c3b41ede29df6a5541e47e5118889a62492c7013c099118a77aecaf6b94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-gogo-runtime \
mvn-org.apache.felix-org.apache.felix.gogo.runtime \
mvn-org.apache.felix-org.apache.felix.gogo.runtime-pom- \
osgi-org.apache.felix.gogo.runtime"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.osgi-osgi.annotation \
mvn-org.osgi-osgi.cmpn \
mvn-org.osgi-osgi.core"

inherit rpm
