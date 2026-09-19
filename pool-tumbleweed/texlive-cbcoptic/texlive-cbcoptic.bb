SUMMARY = "Coptic fonts and LaTeX macros for general usage and for philology"
DESCRIPTION = "CBcoptic is a bundle of files for typesetting Coptic \
philological text with the proper fonts and hyphenation. The \
fonts are based on, but much extend, the fonts of the original \
coptic bundle. The CBcoptic bundle includes font description \
files, Metafont sources and equivalent Adobe Type 1 fonts in \
pfb format. The bundle also includes a package that provides \
some macros of philological interest."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn16666"

RPM_NAME = "texlive-cbcoptic-2026.226.0.0.2svn16666-59.2.noarch.rpm"
RPM_HASH = "1b9869bf443b6e22327de17b527f51087213726529471d16995cc4033fd7b8ee078a4da5566c8c4beffc1fb617ea5e630582d6084e675524afe8e059d5075d6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-copti.tfm \
tex-coptic.sty \
tex-copto.tfm \
tex-lcopcoptic.fd \
tex-prnthyph.sty \
texlive-cbcoptic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-textcomp.sty \
texlive \
texlive-cbcoptic-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
