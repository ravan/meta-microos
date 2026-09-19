SUMMARY = "API documentation for apache-commons-io"
DESCRIPTION = "This package provides API documentation for apache-commons-io."
LICENSE = "Apache-2.0"

PV = "2.22.0"

RPM_NAME = "apache-commons-io-javadoc-2.22.0-1.3.noarch.rpm"
RPM_HASH = "da2d11b47bbc2d35473c36e81767ba7f146a3eefbe6ca9fe20a51fcd2315ae7965530e1c33d254f34a07db4c8027d2d1257759d684bf8b71178a69b61df31b77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-io-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
