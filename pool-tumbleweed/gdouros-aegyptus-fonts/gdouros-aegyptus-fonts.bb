SUMMARY = "Fonts with Support for Ancient Egyptian Hieroglyphs"
DESCRIPTION = "Aegyptus allocates Egyptian Hieroglyphs, in Plane 15 of the UCS. The main \
sources of glyphs are «Hieroglyphica», PIREI, 2000 and the work of Alan \
Gardiner. The font also covers Basic Latin, Egyptian Transliteration \
characters, the Hieratic alphabet, Coptic, Meroitic, the Gardiner set \
supported by Unicode, et al. The Gardiner set (redesigned with a thicker \
line) is also available in the small font Gardiner."
LICENSE = "SUSE-Permissive"

PV = "6.17"

RPM_NAME = "gdouros-aegyptus-fonts-6.17-1.24.noarch.rpm"
RPM_HASH = "fc02335dca68ad7752660dae3265eae65187f0df2ee94b9f5d4532d4698a8af1feb8ea33b66c1ee9dad5d5891c6b2f7bd82acb8068ac663dbf9e9ad2e3832fe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aegyptus-fonts \
gdouros-aegyptus-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
