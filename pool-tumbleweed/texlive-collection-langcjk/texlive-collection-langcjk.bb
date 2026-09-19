SUMMARY = "Chinese/Japanese/Korean (base)"
DESCRIPTION = "Packages supporting a combination of Chinese, Japanese, Korean, \
including macros, fonts, documentation. Also Thai in the c90 \
encoding, since there is some overlap in those fonts; standard \
Thai support is in collection-langother. Additional packages \
for CJK are in their individual language collections."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn65824"

RPM_NAME = "texlive-collection-langcjk-2026.222.svn65824-68.2.noarch.rpm"
RPM_HASH = "15a0ffb3de072a2b509bc99614109797d5b92ebe4ef7bb707f697f88eea9f58e605e1c236663acf63e56dc4396d7bd8f8e78b25bc651f68c29322736cf26c5a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zh;ja;ko \
pattern- \
pattern-category- \
tex-chinese \
tex-cjk \
tex-japanese \
tex-korean \
texlive-collection-langcjk"

RDEPENDS:${PN} += "texlive-adobemapping \
texlive-c90 \
texlive-cjk \
texlive-cjk-gs-integrate \
texlive-cjkpunct \
texlive-cjkutils \
texlive-collection-basic \
texlive-dnp \
texlive-evangelion-jfm \
texlive-fixjfm \
texlive-garuda-c90 \
texlive-jfmutil \
texlive-norasi-c90 \
texlive-pxtatescale \
texlive-xcjk2uni \
texlive-xecjk \
texlive-zitie \
texlive-zxjafont"

inherit rpm
