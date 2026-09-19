SUMMARY = "Use LGR-encoded fonts in math mode"
DESCRIPTION = "The lgrmath package is a LaTeX package which sets the Greek \
letters in math mode to use glyphs from the LGR-encoded font of \
one's choice. The documentation includes a rather extensive \
list of the available font family names on typical LaTeX \
installations."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn65038"

RPM_NAME = "texlive-lgrmath-2026.226.1.0svn65038-61.2.noarch.rpm"
RPM_HASH = "2f15292cd69397c5d957e1166e2926aadcca993d85cf00b161720141ca3f59fd78a4aef0aaab9bc242090d6c29c095e799945d132cf3af1d5891c85d420d522f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lgrmath.sty \
texlive-lgrmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
