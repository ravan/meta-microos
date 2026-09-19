SUMMARY = "Control sectional headers"
DESCRIPTION = "A LaTeX2e package to help change the style of any or all of \
LaTeX's sectional headers in the article, book, or report \
classes. Examples include the addition of rules above or below \
a section title."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.2svn77682"

RPM_NAME = "texlive-sectsty-2026.226.2.0.2svn77682-60.2.noarch.rpm"
RPM_HASH = "29fe411e208adc2a2e5c2434f37a1213e75fff5a3988661c5351ce521dd5ef7072c6f4269f921be3c22e34699dc3d68fb1dd506a1a2bf7b608d4c1f2d249b05b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sectsty.sty \
texlive-sectsty"

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
