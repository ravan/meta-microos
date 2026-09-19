SUMMARY = "Examples from The LaTeX Graphics Companion"
DESCRIPTION = "The source of the examples printed in the book, together with \
necessary supporting files."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn29235"

RPM_NAME = "texlive-latex-graphics-companion-2026.226.svn29235-63.2.noarch.rpm"
RPM_HASH = "eb6152ba007ba2e87e315b68f0d3156177c60bda232c1fb50c57ca196e995859dd29bf44d0dc9edeac58e492f9015254604ff3c7b03819c815ee78a75eed25a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-graphics-companion"

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
