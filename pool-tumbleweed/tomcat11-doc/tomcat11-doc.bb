SUMMARY = "Javadoc generated documentation for Apache Tomcat"
DESCRIPTION = "Javadoc generated documentation files for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "11.0.25"

RPM_NAME = "tomcat11-doc-11.0.25-1.1.noarch.rpm"
RPM_HASH = "bc1796ad61bbf786169679bd448a4e88349bfa2a11788aebe4649f47e6c22fdee825d71e19db76e2715750cfec75f05a6b5dc30d128e0fa3b306bc77ea16eccc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-implementation-javadoc \
tomcat11-doc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
