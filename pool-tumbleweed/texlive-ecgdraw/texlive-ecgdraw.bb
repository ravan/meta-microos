SUMMARY = "Draws electrocardiograms (ECG)"
DESCRIPTION = "This package provides the \\ECG{<code>} command which draws \
electrocardiograms (ECG). The <code> represents a series of \
abbreviations which allow to draw different types of wave."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76130"

RPM_NAME = "texlive-ecgdraw-2026.226.0.0.1svn76130-61.4.noarch.rpm"
RPM_HASH = "8d550c27c3879ccfeddcaf92dfa4ff15c45e4f100815dbdd121d2826b8ca3d489143c7571a0b917f6fd2dde1d16610b5a37bae5e2aa278a17dc85cdbc1ce4e6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ecgdraw.sty \
texlive-ecgdraw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
