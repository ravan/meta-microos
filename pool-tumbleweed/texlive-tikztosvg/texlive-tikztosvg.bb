SUMMARY = "A utility for rendering TikZ diagrams to SVG"
DESCRIPTION = "This package provides a shell script that calls XeTeX and \
pdf2svg to convert TikZ environments to SVG files."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.3.0svn60289"

RPM_NAME = "texlive-tikztosvg-2026.226.0.0.3.0svn60289-59.2.noarch.rpm"
RPM_HASH = "555f64b38016b10d7f122c52af034e416eac32f8770a89b3ab3a795cc94fe12704a6b8f8d35feb00a6466c61ea0020dbb25f5820f8796b2e27df7d54d46e04d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikztosvg"

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
texlive-scripts-bin \
texlive-tikztosvg-bin"

inherit rpm
