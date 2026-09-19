SUMMARY = "Istack-commons tools"
DESCRIPTION = "This package contains istack-commons tools."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-tools-3.0.7-8.10.noarch.rpm"
RPM_HASH = "eebdc9a30a2f64f0473edf3725ce23678c4775e27c81d75d887d917337dc66a75b1deceee8a811c881369148bf1b7510e3f57d6820b3d3902b75c54e7d8238d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons-tools \
mvn-com.sun.istack-istack-commons-tools \
mvn-com.sun.istack-istack-commons-tools-pom- \
osgi-com.sun.istack.commons-tools"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant"

inherit rpm
