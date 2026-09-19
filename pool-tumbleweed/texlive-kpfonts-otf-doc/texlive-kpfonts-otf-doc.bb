SUMMARY = "Documentation for texlive-kpfonts-otf"
DESCRIPTION = "This package includes the documentation for texlive-kpfonts-otf"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.72svn77917"

RPM_NAME = "texlive-kpfonts-otf-doc-2026.226.0.0.72svn77917-63.2.noarch.rpm"
RPM_HASH = "905220365362d2eb419361a41735f6633a696e4c630b7cd2ea64da4358de39f975bf9ec17f491cba58d3ef63f92a4bdb04064e771f4dc46f3a00fed522663384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-kpfonts-otf-doc-en;fr \
texlive-kpfonts-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
