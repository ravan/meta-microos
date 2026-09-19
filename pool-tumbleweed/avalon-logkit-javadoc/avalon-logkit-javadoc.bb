SUMMARY = "Javadoc for avalon-logkit"
DESCRIPTION = "API documentation for avalon-logkit."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "avalon-logkit-javadoc-2.1-27.9.noarch.rpm"
RPM_HASH = "c48c0b2f515a5b757de0c4f398653a1da8ac1322ca8b1fca09705fadf764ee518b584a2c5ff5bccf02fee87ae15e90e105131c0e3f37eab384e89ba7eaa15032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avalon-logkit-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
