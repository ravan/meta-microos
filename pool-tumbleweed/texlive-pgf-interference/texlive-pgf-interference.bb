SUMMARY = "Drawing interference patterns with PGF/TikZ"
DESCRIPTION = "This LaTeX package makes it possible to simulate interference \
patterns occurring on a screen if monochromatic light is \
diffracted at regular structures of slits. It makes use of the \
PGF/TikZ graphics package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76924"

RPM_NAME = "texlive-pgf-interference-2026.226.0.0.1svn76924-58.2.noarch.rpm"
RPM_HASH = "8f408cbd96e811b76256e01d935fb2f4f242153e0afda6ca60a0e97f9af7c317507902b50761aa6d59aecd7d90df35bfa82dffeaeb788cfc178dec500373af24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgf-interference.sty \
texlive-pgf-interference"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
