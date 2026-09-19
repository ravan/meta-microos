SUMMARY = "Javadoc for javacc-maven-plugin"
DESCRIPTION = "API documentation for javacc-maven-plugin."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "javacc-maven-plugin-javadoc-3.1.0-1.7.noarch.rpm"
RPM_HASH = "73db8e2b388f6535bf666f4dce899af0eb601fd00c10b418ffe5b9e3bf6f08bf28451370fe60cabe13c56ae0d45841110a520c5fbfc718dd9f56f63a259ff63c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javacc-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
