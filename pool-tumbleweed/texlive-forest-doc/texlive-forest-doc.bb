SUMMARY = "Documentation for texlive-forest"
DESCRIPTION = "This package includes the documentation for texlive-forest"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.5svn77682"

RPM_NAME = "texlive-forest-doc-2026.226.2.1.5svn77682-60.2.noarch.rpm"
RPM_HASH = "0e3d6739cdd0a8184f9827474b3bfcba973927c4fad740bc22af7b2da77a9fa7795bd0edaa564a6e975d8efca7ca5936645433193dc6e4f39b6dc0b0880cca2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-forest-doc"

RDEPENDS:${PN} += ""

inherit rpm
