SUMMARY = "Documentation for texlive-alkalami"
DESCRIPTION = "This package includes the documentation for texlive-alkalami"
LICENSE = "OFL-1.1"

PV = "2026.226.1.000svn44497"

RPM_NAME = "texlive-alkalami-doc-2026.226.1.000svn44497-61.2.noarch.rpm"
RPM_HASH = "9d2501e0407443abca5c7dc09947a87b22be4936e921e75d9222a3daa7665d1e8081c0fdbe758442aa21c988c3de7fefb637aa5c4371cf2ce3c25e172863684d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alkalami-doc"

RDEPENDS:${PN} += ""

inherit rpm
