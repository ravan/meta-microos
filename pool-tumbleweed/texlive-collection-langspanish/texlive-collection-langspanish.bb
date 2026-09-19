SUMMARY = "Spanish"
DESCRIPTION = "Support for Spanish."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn72203"

RPM_NAME = "texlive-collection-langspanish-2026.222.svn72203-68.2.noarch.rpm"
RPM_HASH = "0698e8e2703ee17e5b83fb3fcacc6be5117218636b7aeb59d521be4ebbb1a6fc636d966d37f67e617dcaccf5a3dca25d03f3be4ba1d869d6ef00004d5272cf77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-spanish \
texlive-collection-langspanish"

RDEPENDS:${PN} += "texlive-antique-spanish-units \
texlive-babel-catalan \
texlive-babel-galician \
texlive-babel-spanish \
texlive-collection-basic \
texlive-es-tex-faq \
texlive-hyphen-catalan \
texlive-hyphen-galician \
texlive-hyphen-spanish \
texlive-l2tabu-spanish \
texlive-latex2e-help-texinfo-spanish \
texlive-latexcheat-esmx \
texlive-lshort-spanish \
texlive-quran-es \
texlive-texlive-es"

inherit rpm
