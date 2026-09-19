SUMMARY = "Documentation for texlive-wasysym"
DESCRIPTION = "This package includes the documentation for texlive-wasysym"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn77682"

RPM_NAME = "texlive-wasysym-doc-2026.226.2.4svn77682-60.2.noarch.rpm"
RPM_HASH = "ac52714c62fb9ba3b185cc2ca16066ff40c61d4003bf196ec7867176554c1fe999da691d4fb6929f0ead7ee2c829c11d4dab3981da4ececf37acad43419c2d1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wasysym-doc"

RDEPENDS:${PN} += ""

inherit rpm
