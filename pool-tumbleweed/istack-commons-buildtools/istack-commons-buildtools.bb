SUMMARY = "Istack-commons buildtools"
DESCRIPTION = "This package contains istack-commons buildtools."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-buildtools-3.0.7-8.10.noarch.rpm"
RPM_HASH = "767ba0cd6ccefd41f5ac510e2d98c9cb5c8a67ee4e420e67b3bd5da0b71523ede3e2c8677087376d398c95821a974fab38049ace0e0f711e7e27da338ff7b47a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons-buildtools \
mvn-com.sun.istack-istack-commons-buildtools \
mvn-com.sun.istack-istack-commons-buildtools-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.codemodel-codemodel \
mvn-org.apache.ant-ant"

inherit rpm
