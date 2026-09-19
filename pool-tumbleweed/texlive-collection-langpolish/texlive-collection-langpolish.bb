SUMMARY = "Polish"
DESCRIPTION = "Support for Polish."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn54074"

RPM_NAME = "texlive-collection-langpolish-2026.222.svn54074-68.2.noarch.rpm"
RPM_HASH = "4b831e1da8ef7d927b8685815161c901107efb3bd7b7cc07309a856094ec08913a9bff244d021e080ed44d0d63915e4be42595f8f8dd1d405043a27561b8da00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-polish \
texlive-collection-langpolish"

RDEPENDS:${PN} += "texlive-babel-polish \
texlive-bredzenie \
texlive-cc-pl \
texlive-collection-basic \
texlive-collection-latex \
texlive-gustlib \
texlive-gustprog \
texlive-hyphen-polish \
texlive-lshort-polish \
texlive-mex \
texlive-mwcls \
texlive-pl \
texlive-polski \
texlive-przechlewski-book \
texlive-qpxqtx \
texlive-tap \
texlive-tex-virtual-academy-pl \
texlive-texlive-pl \
texlive-utf8mex"

inherit rpm
