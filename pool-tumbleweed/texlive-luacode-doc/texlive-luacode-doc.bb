SUMMARY = "Documentation for texlive-luacode"
DESCRIPTION = "This package includes the documentation for texlive-luacode"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn77682"

RPM_NAME = "texlive-luacode-doc-2026.226.1.2asvn77682-59.2.noarch.rpm"
RPM_HASH = "31f75cce1054810454e8e2b1c6381586cf3c7fd3b4a7f2ad09e163c221851b5fdeb6b7c7bb9150ca0d64154675495bea8529cf92acf5ece0081ab03315c312f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luacode-doc"

RDEPENDS:${PN} += ""

inherit rpm
