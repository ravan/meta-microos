SUMMARY = "A variable-width minipage"
DESCRIPTION = "The varwidth environment is superficially similar to minipage, \
but the specified width is just a maximum value -- the box may \
get a narrower 'natural' width."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.92svn77682"

RPM_NAME = "texlive-varwidth-2026.226.0.0.92svn77682-60.2.noarch.rpm"
RPM_HASH = "ce794911521938c14d0a88f02e32719b9a575980c6a00ee46becd84f3563dbd87e5e69e9e92c117bc06d440ef204ed0019b7462e4da2b15bb97643b206ad5cd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-varwidth.sty \
texlive-varwidth"

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
