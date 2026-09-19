SUMMARY = "API documentation for xmvn-connector-ivy"
DESCRIPTION = "This package provides API documentation for xmvn-connector-ivy."
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "xmvn-connector-ivy-javadoc-4.0.0-1.7.noarch.rpm"
RPM_HASH = "02733c58f89ca1b5f224ffd81d579650c85ee8a174c504a5a5796dcd28f028782903e86d3826bed65fe5929043e61bd94b48690b797b37e327d4845542e1eb08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn-connector-ivy-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
