SUMMARY = "Library for Font Configuration"
DESCRIPTION = "Fontconfig is a library for configuring and customizing font access. It \
contains two essential modules: the configuration module, which builds \
an internal configuration from XML files, and the matching module, \
which accepts font patterns and returns the nearest matching font."
LICENSE = "MIT"

PV = "2.18.1"

RPM_NAME = "fontconfig-2.18.1-1.3.aarch64.rpm"
RPM_HASH = "686a883d8af5ec5c4c2b2d0df02eda22b03a46ac60599ff1d14640d1a2a36ce0b0a2f5650f4dfd9af030190cd130acbde698213e816d46efd83ac88d0b30c698"

RPROVIDES:${PN} += "IPA-fonts-config \
config-fontconfig \
fontconfig \
ipa-fonts-config"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6"

inherit rpm
