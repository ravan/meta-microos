SUMMARY = "GNU Unifont (OpenType Format)"
DESCRIPTION = "The GNU Unifont by Roman Czyborra. \
Glyphs above the Unicode Basic Multilingual Plane. \
Unicode ConScript Unicode Registry (CSUR) PUA Glyphs. \
 \
This package contains fonts in OpenType format."
LICENSE = "GPL-2.0-or-later | OFL-1.1"

PV = "17.0.04"

RPM_NAME = "gnu-unifont-otf-fonts-17.0.04-1.2.noarch.rpm"
RPM_HASH = "1b22e5a15a50ae98e441b9d8ea36b8ba4d5a31afe0571b1a79bd7633833e3eb895793fa283d73573d01c99e2226503fd860dc866d475d8b535ec858624a9c838"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-unifont-otf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
