SUMMARY = "Documentation for texlive-novel"
DESCRIPTION = "This package includes the documentation for texlive-novel"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-novel-doc-2026.226.2.2svn77682-61.2.noarch.rpm"
RPM_HASH = "c785f22c84ff28f328e01e9386b6fc55da31a273e7f0497a546d024fd56b0b8817cdc67dfb877f04ec81d6d0f6f4fd72bb3d831f458cfe0655adbb9622b58275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-novel-doc"

RDEPENDS:${PN} += ""

inherit rpm
