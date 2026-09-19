SUMMARY = "Qt-based ups monitor (front-end for upsc from Network UPS Tools)"
DESCRIPTION = "upsm is Qt-based ups monitor (front-end for upsc from Network UPS Tools). \
It sits at the tray and polls nut server using upsc, so you need to set \
up NUT first."
LICENSE = "SUSE-Public-Domain"

PV = "3.0.0"

RPM_NAME = "upsm-3.0.0-2.14.aarch64.rpm"
RPM_HASH = "d641a44b554c3ed422f460929f00b2a0261732bed8ed9cf3820873f2cbd2e86a6b779bf36e1b89ea26508b621458dc246385a404877ee1b2c00729d21a19d110"

RPROVIDES:${PN} += "upsm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
nut"

inherit rpm
