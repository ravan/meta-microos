SUMMARY = "Hacks to make writing quantum papers for revtex4-1 less painful"
DESCRIPTION = "This package provides a number of useful hacks to solve common \
annoyances with the revtex4-1 package, and to define notation \
in common use within quantum information. In doing so, it \
imports and configures a number of commonly-available and used \
packages, and where reasonable, provides fallbacks. It also \
warns when users try to load packages which are known to be \
incompatible with revtex4-1."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11svn43505"

RPM_NAME = "texlive-revquantum-2026.226.0.0.11svn43505-60.4.noarch.rpm"
RPM_HASH = "0469809a9f6d93412084a30f46cec9788829833cd2f01023c28ab45a0c1b130bdd6637378a59d689b1def39691e014eb80378f4a2776e230b0293a75c2416caa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-revquantum.sty \
texlive-revquantum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm.sty \
tex-algpseudocode.sty \
tex-amsbsy.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-braket.sty \
tex-color.sty \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-letltxmacro.sty \
tex-listings.sty \
tex-mathpazo.sty \
tex-sourcecodepro.sty \
tex-stmaryrd.sty \
tex-textcomp.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
