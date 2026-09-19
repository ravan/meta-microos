SUMMARY = "Book publishing scheme (core LaTeX and add-ons)"
DESCRIPTION = "This is a book publishing scheme, containing core (Lua)LaTeX \
and selected additional packages likely to be useful for \
non-technical book publication. It does not contain additional \
fonts (different books need different fonts, and the packages \
are large), nor does it contain additional mathematical or \
other technical packages."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn63547"

RPM_NAME = "texlive-scheme-bookpub-2026.222.svn63547-68.2.noarch.rpm"
RPM_HASH = "11f624e81401e67a217a718332df472bc8d75174ecf87ec42f51dc8a65c88636f4a590c59668c5d85dfa9cd8ab3846598ba7afc359a548f231eedcb65a32a089"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-bookpub \
texlive-scheme-bookpub"

RDEPENDS:${PN} += "texlive-barcodes \
texlive-biber \
texlive-biblatex \
texlive-bookcover \
texlive-caption \
texlive-collection-basic \
texlive-collection-latex \
texlive-enumitem \
texlive-fontspec \
texlive-latexmk \
texlive-lipsum \
texlive-listings \
texlive-markdown \
texlive-memoir \
texlive-microtype \
texlive-minted \
texlive-novel \
texlive-octavo \
texlive-pdfpages \
texlive-pgf \
texlive-qrcode \
texlive-shapes \
texlive-titlesec \
texlive-tocloft \
texlive-tufte-latex \
texlive-willowtreebook"

inherit rpm
