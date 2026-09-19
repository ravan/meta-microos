SUMMARY = "Documentation for texlive-librebaskerville"
DESCRIPTION = "This package includes the documentation for texlive-librebaskerville"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-librebaskerville-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "7cfd3e13f5311b53721f6647c12133e2dd25dc7860221f54b7340d5246379fde070999bb8e6ff4977c51260a02fd2a540bf12ac4584742b4be32a73754fa42d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-librebaskerville-doc"

RDEPENDS:${PN} += ""

inherit rpm
