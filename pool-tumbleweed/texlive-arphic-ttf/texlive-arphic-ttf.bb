SUMMARY = "TrueType version of Chinese Arphic fonts"
DESCRIPTION = "This package provides TrueType versions of the Chinese Arphic \
fonts for use with XeLaTeX and LuaLaTeX. Type1 versions of \
these fonts, for use with pdfLaTeX and the cjk package, are \
provided by the arphic package. Arphic is actually the name of \
the company which created these fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn42675"

RPM_NAME = "texlive-arphic-ttf-2026.226.svn42675-60.2.noarch.rpm"
RPM_HASH = "a0eacd0c7ae4aac88a88574503ed45a51f48a10b7a8bc7343db905f191f599f8cc6068ac30280205686f4b1919253252a33c0a07c3c502045ceff0d4d9814e1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arphic-ttf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-arphic-ttf-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
