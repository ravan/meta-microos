SUMMARY = "Documentation for texlive-clearsans"
DESCRIPTION = "This package includes the documentation for texlive-clearsans"
LICENSE = "Apache-1.0"

PV = "2026.226.svn74767"

RPM_NAME = "texlive-clearsans-doc-2026.226.svn74767-60.2.noarch.rpm"
RPM_HASH = "544a6bf7c03c862ddff523a3a9e535050032c97255333ca52cf73657bd076b645fcf1b6ee2d9b559ada04fe4d5030d1a5a89710f1c14faf0ce4d2c0a216ebb31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clearsans-doc"

RDEPENDS:${PN} += ""

inherit rpm
