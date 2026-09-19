SUMMARY = "Documentation for texlive-luacolor"
DESCRIPTION = "This package includes the documentation for texlive-luacolor"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.18svn77682"

RPM_NAME = "texlive-luacolor-doc-2026.226.1.18svn77682-59.2.noarch.rpm"
RPM_HASH = "b27342f25f2fe7ca24e8e11fc13b7648ce048c91015c1cbee3bb5c91f836f94db17134aeeb2b404d6b77d84f7ce1ea04efb51c5ec8be24c9f31f4bf6a827973f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luacolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
