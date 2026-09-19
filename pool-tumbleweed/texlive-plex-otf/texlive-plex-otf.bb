SUMMARY = "Support for the OpenType font IBM Plex"
DESCRIPTION = "This package supports the free otf fonts from the IBM Plex \
project which are available from GitHub or already part of your \
system (Windows/Linux/...). This package supports only XeLaTeX \
or LuaLaTeX; for pdfLaTeX use plex-mono.sty, plex-sans.sty, \
and/or plex-serif.sty from the plex package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.11asvn77682"

RPM_NAME = "texlive-plex-otf-2026.226.0.0.11asvn77682-59.2.noarch.rpm"
RPM_HASH = "f9d9178686579a91148a32bcd433ed941fdd17966e79f7cba93ed70d4252fb5b73c1409caff983e6f7dd4de7eecf233659b2215a0a16b1e16a0f7c0fc3cba379"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-plex-otf.sty \
texlive-plex-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-textcomp.sty \
tex-unicode-math.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
