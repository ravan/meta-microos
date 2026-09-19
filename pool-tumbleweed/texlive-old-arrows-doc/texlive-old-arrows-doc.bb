SUMMARY = "Documentation for texlive-old-arrows"
DESCRIPTION = "This package includes the documentation for texlive-old-arrows"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-old-arrows-doc-2026.226.2.0svn77682-61.2.noarch.rpm"
RPM_HASH = "f7136d1f8ed7f88e24bab6bebb406dc67eeadc683b888cc1ebe98dfe06996b62f1ac8f20a4ae519c6f3453ed06bb83846ed3ef3ac5b2d3c4ef7f695c27a29de6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-old-arrows-doc-it \
texlive-old-arrows-doc"

RDEPENDS:${PN} += ""

inherit rpm
