SUMMARY = "API documentation for xmvn5-mojo"
DESCRIPTION = "This package provides API documentation for xmvn5-mojo."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "xmvn5-mojo-javadoc-5.1.0-3.1.noarch.rpm"
RPM_HASH = "cbac1999529903350d3506ef27136dfe81d27a320801f75295850c28c04e7f6861bbe211596d5396eae3d3d7173ab6d3019e103b3957c83a54b1961dbdd99b10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn5-mojo-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
