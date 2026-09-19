SUMMARY = "API documentation for juniversalchardet"
DESCRIPTION = "API documentation for juniversalchardet."
LICENSE = "MPL-1.1"

PV = "1.0.3"

RPM_NAME = "juniversalchardet-javadoc-1.0.3-4.3.noarch.rpm"
RPM_HASH = "c89c4232fb81ed09d3dfa59884ac85b1e8d5d61d99d37f18ab7bf4a505793141af846295197d2660553c6a04b64b384dc2baaef070d5afa321f5b006aa614615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "juniversalchardet-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
