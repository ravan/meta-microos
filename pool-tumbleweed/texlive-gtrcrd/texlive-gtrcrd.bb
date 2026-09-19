SUMMARY = "Add chords to lyrics"
DESCRIPTION = "The package provides the means to specify guitar chords to be \
played with each part of the lyrics of a song. The syntax of \
the macros reduces the chance of failing to provide a chord \
where one is needed, and the structure of the macros ensures \
that the chord specification appears immediately above the \
start of the lyric."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn32484"

RPM_NAME = "texlive-gtrcrd-2026.226.1.1svn32484-60.4.noarch.rpm"
RPM_HASH = "959a271a8d638fa448f82d9c635feb0c685b877849ca3da0d38005bedcfda269d3d2a9a63f6567a00d6eb756d0c2c635668d7cfcb38a27c8429cde808e7fcc32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gtrcrd.sty \
texlive-gtrcrd"

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
