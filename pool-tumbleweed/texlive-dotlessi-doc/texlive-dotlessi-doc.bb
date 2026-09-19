SUMMARY = "Documentation for texlive-dotlessi"
DESCRIPTION = "This package includes the documentation for texlive-dotlessi"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-dotlessi-doc-2026.226.1.1svn77682-59.2.noarch.rpm"
RPM_HASH = "963a0e911490731778c03f35f31fe158559dbffdb7397c3a24a29631131dbb5e3f6f80e886176be68073290512abc1518e10ae3b3fe4b98a1aeb535ec28fc59b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dotlessi-doc"

RDEPENDS:${PN} += ""

inherit rpm
