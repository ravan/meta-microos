SUMMARY = "XeTeX and packages"
DESCRIPTION = "Packages for XeTeX, the Unicode/OpenType-enabled TeX by \
Jonathan Kew. See https://tug.org/xetex."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn77786"

RPM_NAME = "texlive-collection-xetex-2026.222.svn77786-68.2.noarch.rpm"
RPM_HASH = "ad8c31862d5d0fd541c6cd23c62a0aeeba9a2c1d5c4d483728294feb1253bfa1acb9353956d32669c963ab837c9a99e85d13ae83e1d58d62bae5f82626dec5f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-xetex \
texlive-collection-xetex"

RDEPENDS:${PN} += "texlive-arabxetex \
texlive-bidi-atbegshi \
texlive-bidicontour \
texlive-bidipagegrid \
texlive-bidipresentation \
texlive-bidishadowtext \
texlive-businesscard-qrcode \
texlive-collection-basic \
texlive-cqubeamer \
texlive-fixlatvian \
texlive-font-change-xetex \
texlive-fontbook \
texlive-fontwrap \
texlive-interchar \
texlive-na-position \
texlive-philokalia \
texlive-ptext \
texlive-simple-resume-cv \
texlive-simple-thesis-dissertation \
texlive-tetragonos \
texlive-ucharclasses \
texlive-unicode-bidi \
texlive-unimath-plain-xetex \
texlive-unisugar \
texlive-xebaposter \
texlive-xechangebar \
texlive-xecolor \
texlive-xecyr \
texlive-xeindex \
texlive-xelatex-dev \
texlive-xesearch \
texlive-xespotcolor \
texlive-xetex \
texlive-xetex-itrans \
texlive-xetex-pstricks \
texlive-xetex-tibetan \
texlive-xetexconfig \
texlive-xetexfontinfo \
texlive-xetexko \
texlive-xevlna \
texlive-zbmath-review-template"

inherit rpm
