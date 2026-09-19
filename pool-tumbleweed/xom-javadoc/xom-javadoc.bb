SUMMARY = "API documentation for xom"
DESCRIPTION = "This package provides API documentation for xom."
LICENSE = "LGPL-2.0-only"

PV = "1.3.9"

RPM_NAME = "xom-javadoc-1.3.9-3.7.noarch.rpm"
RPM_HASH = "9dfa3778caed0d3a73f58fe4d69b65777a9fc811157ed75e3515633f77f3830ecde104aa17aea03e332772020ab4aa33f4315d1442a08429972f2e561a7e53b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xom-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
