SUMMARY = "Documentation for texlive-pxbase"
DESCRIPTION = "This package includes the documentation for texlive-pxbase"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-pxbase-doc-2026.226.1.4svn77682-60.4.noarch.rpm"
RPM_HASH = "944d951b939f03c4e55260c74af86ae22c203ec81de662204ec8ff0fa47615ce3f5c98a0ee96fc1b60d0faf9cfd3bad07303691d2adbc3543cca2a8d6b6c9c09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxbase-doc-ja \
texlive-pxbase-doc"

RDEPENDS:${PN} += ""

inherit rpm
