SUMMARY = "GNU Unifont (X11 portable compiled format)"
DESCRIPTION = "The GNU Unifont by Roman Czyborra. \
Glyphs above the Unicode Basic Multilingual Plane. \
Unicode ConScript Unicode Registry (CSUR) PUA Glyphs. \
 \
This package contains the font in .pcf format."
LICENSE = "GPL-2.0-or-later | OFL-1.1"

PV = "17.0.04"

RPM_NAME = "gnu-unifont-bitmap-fonts-17.0.04-1.2.noarch.rpm"
RPM_HASH = "76ff27e87f6bc78b15b29b33c1a660e1d7efb00ab5efbd1a01627141088e62c32003f387ebf5927d752086b4c496c32bb699958075fa3dcde0f83624e403c8c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-unifont-bitmap-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
