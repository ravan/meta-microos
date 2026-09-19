SUMMARY = "Software for Hantek DSO6022 USB digital signal oscilloscopes"
DESCRIPTION = "OpenHantek6022 is a free software for Hantek DSO6022 USB digital signal \
oscilloscopes that is actively developed on \
github.com/OpenHantek/OpenHantek6022 - but only for Hantek 6022BE/BL and \
compatible scopes (Voltcraft, Darkwire, Protek, Acetech, etc.)."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.3"

RPM_NAME = "openhantek-3.3.3-1.12.aarch64.rpm"
RPM_HASH = "0cc3e796c923c0614d056f1ac8e17482d7565c97bc01d48e9bf6228e642bcd3a3d20484ef6081cdbb68b1aa591d38631c9c75bd26a485791bbfdece1df5dc2d2"

RPROVIDES:${PN} += "openhantek"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
