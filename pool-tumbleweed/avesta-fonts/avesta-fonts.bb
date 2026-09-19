SUMMARY = "Avestan Unicode Fonts"
DESCRIPTION = "The glyph outlines origin from Yasna 10 of the manuscript of Tehran University \
Library, nr. 11263. The scanned manuscript can be viewed under Ave976 on \
wwww.avesta-archive.org."
LICENSE = "OFL-1.1"

PV = "20121212"

RPM_NAME = "avesta-fonts-20121212-3.25.noarch.rpm"
RPM_HASH = "d7e0da1a51f7a929af35dde02d0e0ebc1326def89e019fe86ed41f94c08fe3594ecfe9a351e3d5bdc18ee9eb0e8c12fe41e543d623356ebc35a2bcf84b43b9c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avesta-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
