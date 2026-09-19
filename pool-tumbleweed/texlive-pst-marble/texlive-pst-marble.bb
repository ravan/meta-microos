SUMMARY = "A PSTricks package to draw marble-like patterns"
DESCRIPTION = "This is a PSTricks package to draw marble-like patterns."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn50925"

RPM_NAME = "texlive-pst-marble-2026.226.1.6svn50925-59.2.noarch.rpm"
RPM_HASH = "6c12f864a55b92a65d0a0d6603fb51ccf0baa6eddab3b744e9aaf03b75833fb562fdfa9709c23deda813c837f7f4d2aef55fe1dfc2ab0938249ad4c3667bc67c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-marble.sty \
tex-pst-marble.tex \
texlive-pst-marble"

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
