SUMMARY = "Documentation for texlive-sanitize-umlaut"
DESCRIPTION = "This package includes the documentation for texlive-sanitize-umlaut"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.0svn77720"

RPM_NAME = "texlive-sanitize-umlaut-doc-2026.226.1.4.0svn77720-60.2.noarch.rpm"
RPM_HASH = "89c3d2a1cc098b70c522284286c4cfeebc9bd0bf4a5ed7d1222459eed059cd7c0108f06f7b2c7ff437e9b901d8046ee565570609a6f3c19d457915a471459713"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sanitize-umlaut-doc"

RDEPENDS:${PN} += ""

inherit rpm
