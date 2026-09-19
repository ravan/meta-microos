SUMMARY = "API documentation for apache-commons-net"
DESCRIPTION = "API documentation for apache-commons-net."
LICENSE = "Apache-2.0"

PV = "3.13.0"

RPM_NAME = "apache-commons-net-javadoc-3.13.0-1.3.noarch.rpm"
RPM_HASH = "dd5203b68c0314b08eeb634a22337124522c5209a60cb18f729872d528bce01c65760854aaee8e1cee601699442cb6c81a21a734c75d435a4b8c40d8c45fc505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-net-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
