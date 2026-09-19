SUMMARY = "Documentation for texlive-asmeconf"
DESCRIPTION = "This package includes the documentation for texlive-asmeconf"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.46svn77682"

RPM_NAME = "texlive-asmeconf-doc-2026.226.1.46svn77682-60.2.noarch.rpm"
RPM_HASH = "f453dec1abd6130c78cf29cc6dbd1dc76c19b5d8b6c1737f2303b2f698b12361a4a5eec4956803968f5be3f843c5c70b7161a8eee2d113ca9f7165926b13a800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asmeconf-doc"

RDEPENDS:${PN} += ""

inherit rpm
