SUMMARY = "Documentation for texlive-quiver"
DESCRIPTION = "This package includes the documentation for texlive-quiver"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6.0svn77816"

RPM_NAME = "texlive-quiver-doc-2026.226.1.6.0svn77816-60.4.noarch.rpm"
RPM_HASH = "6bbc4ccacd2b410a5d27f1bcd081a484ba3f68c54384d524b781aae8518b8eeec5bd707769a406460f0ae5793a82a319bbefc7aac61beb7124fba70483fff14c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quiver-doc"

RDEPENDS:${PN} += ""

inherit rpm
