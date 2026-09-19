SUMMARY = "Utility classes for OSGi"
DESCRIPTION = "Utility classes for OSGi"
LICENSE = "Apache-2.0"

PV = "1.11.4"

RPM_NAME = "felix-utils-1.11.4-3.9.noarch.rpm"
RPM_HASH = "384988f7108e4b0cfc2bd1804b66c06f3c3b58104e44b8dcd78ccd8c2268f014351765523be180749d699ddb3dc82f1f5b24ac61c5d2565a4c9c7d418066ee5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-utils \
mvn-org.apache.felix-org.apache.felix.utils \
mvn-org.apache.felix-org.apache.felix.utils-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
