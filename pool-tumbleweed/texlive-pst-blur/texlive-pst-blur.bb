SUMMARY = "PSTricks package for 'blurred' shadows"
DESCRIPTION = "Pst-blur is a package built for use with PSTricks. It provides \
macros that apply blurring to the normal shadow function of \
PSTricks."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn15878"

RPM_NAME = "texlive-pst-blur-2026.226.2.0svn15878-59.2.noarch.rpm"
RPM_HASH = "1f799083280becd65fb2291683b9a0f05bca1c12a165492e9a6489b9155b10d4676e9315c48e8e1d7c983dc24b95bbb237597742622c52b367c3ce165ab46f6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-blur.sty \
tex-pst-blur.tex \
texlive-pst-blur"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
