SUMMARY = "Maths symbol abbreviations"
DESCRIPTION = "Provides macros for defining systematic mnemonic abbreviations, \
starting with ` for math symbols and \\' for arrows, using \
standard symbols as well as those from the amsfonts bundle and \
the stmaryrd package."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-qsymbols-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "8cdbe0f5d4ba09bd6a04bf530999918cc330181cb73f49122d49ff4086cff2f9afca4de8c405886bf45a15e7441ebc1381750ca74d68b5cb198a213c82f6592e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qsymbols.sty \
texlive-qsymbols"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsbsy.sty \
tex-amssymb.sty \
tex-stmaryrd.sty \
tex-xy.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
