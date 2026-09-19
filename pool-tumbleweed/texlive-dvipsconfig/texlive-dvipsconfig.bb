SUMMARY = "Collection of dvips PostScript headers"
DESCRIPTION = "This is a collection of dvips PostScript header and dvips \
config files. They control certain features of the printer, \
including: A4, A3, usletter, simplex, duplex / long edge, \
duplex / short edge, screen frequencies of images, black/white \
invers, select transparency / paper for tektronix 550/560, \
manual feeder, envelope feeder, and tray 1, 2 and 3, and \
printing a PostScript grid underneath the page material--very \
useful for measuring and eliminating paper feed errors!"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.6svn13293"

RPM_NAME = "texlive-dvipsconfig-2026.226.1.6svn13293-61.4.noarch.rpm"
RPM_HASH = "73b98ebad81524bd776a4aab83529bde18ad8de19e2e0774474b1658491524e6e54353d1ce2292335c18ec2b9867b794b599b4a943019b848600bb41b055ef8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dvipsconfig"

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
