SUMMARY = "API documentation for apache-commons-text"
DESCRIPTION = "This package contains the API documentation for apache-commons-text."
LICENSE = "Apache-2.0"

PV = "1.15.0"

RPM_NAME = "apache-commons-text-javadoc-1.15.0-1.3.noarch.rpm"
RPM_HASH = "ddfff79334518bad89c8888a078ca55f20b4b2d4e8d426bc7bc79def66b356868bab6b3687599d7540546fb8f4d1c7034f13d3b61f9f2dd1c373ac4a229ba7f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-text-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
