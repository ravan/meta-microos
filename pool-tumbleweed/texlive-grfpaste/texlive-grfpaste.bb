SUMMARY = "Include fragments of a dvi file"
DESCRIPTION = "Provides a mechanism to include fragments of dvi files with the \
graphicx package, so that you can use \\includegraphics to \
include dvi files. The package requires the dvipaste program."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn17354"

RPM_NAME = "texlive-grfpaste-2026.226.0.0.2svn17354-60.4.noarch.rpm"
RPM_HASH = "55d88b3f01643d9e2652cafb9e8d6b935ec96003f07b3fdf7ca0f27152a8491ce0ea93e0460329a1b5bfe28ed941e5368929d535835cca6e73add5dbb0c7efed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grfpaste.sty \
texlive-grfpaste"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
