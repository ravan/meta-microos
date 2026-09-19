SUMMARY = "Draw rulers around a box"
DESCRIPTION = "This is a LaTeX package for drawing rulers around a box. This \
might be useful when showing the absolute size of something in \
electronic documents, or designating the relative scale in \
printed materials."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn50984"

RPM_NAME = "texlive-rulerbox-2026.226.1.01svn50984-60.2.noarch.rpm"
RPM_HASH = "ca3034f4e132f16716b5b523dd54f0677b0445444714a62e1f2140c5ce399c34321e8e9793eab942fb8883d5ed72234e7eab147e3e311b7371b6521354f5d16b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rulerbox.sty \
texlive-rulerbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
