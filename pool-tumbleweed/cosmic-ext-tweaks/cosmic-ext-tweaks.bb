SUMMARY = "A tweaking tool for the COSMIC DE"
DESCRIPTION = "This is a tool which gives you advanced tweaking options for the Cosmic Desktop"
LICENSE = "GPL-3.0-only"

PV = "0.2.5"

RPM_NAME = "cosmic-ext-tweaks-0.2.5-1.2.aarch64.rpm"
RPM_HASH = "4fb962c54ea9847bcf0c33b891eb935473b0ee64aa8dc7b7da4a58c6e841884aa3cf6d76b2dd0216377cc4a2c2cbfe36d9788461de1486c661a3573bb7ee52ae"

RPROVIDES:${PN} += "cosmic-ext-tweaks"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
