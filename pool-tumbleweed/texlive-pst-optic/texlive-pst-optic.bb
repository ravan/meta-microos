SUMMARY = "Drawing optics diagrams"
DESCRIPTION = "A package for drawing both reflective and refractive optics \
diagrams. The package requires pstricks later than version \
1.10."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05svn72694"

RPM_NAME = "texlive-pst-optic-2026.226.1.05svn72694-59.2.noarch.rpm"
RPM_HASH = "048c9ff93c5dfbf2f67af79524ecb7a44cb926f6e4cbc84fb29f24aa2a8665fcb4b643a20b1911d315076e806295db11254f14a0d58ea424f81d55b53c4e2576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-optic.sty \
tex-pst-optic.tex \
texlive-pst-optic"

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
