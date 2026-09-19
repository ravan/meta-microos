SUMMARY = "Font Mfizz icons for use in LaTeX"
DESCRIPTION = "The MFizz font provides scalable vector icons representing \
programming languages, operating systems, software engineering, \
and technology. It can be seen as an extension to FontAwesome. \
This package requires the fontspec package and either the \
Xe(La)TeX or Lua(La)TeX engine to load the included ttf font."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn43546"

RPM_NAME = "texlive-fontmfizz-2026.226.svn43546-60.2.noarch.rpm"
RPM_HASH = "95a9b9c2649e76cbbe800ee7ccd9e0ac602e8a91778f040f04d66573e8b90289165c18afb898ec969493809a3e47fb47ee8080f4fa0b51b9b016eea0c5042f4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fontmfizz.sty \
texlive-fontmfizz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-fontmfizz-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
