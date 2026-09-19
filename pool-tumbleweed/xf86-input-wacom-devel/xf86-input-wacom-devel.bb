SUMMARY = "Development files for the Xorg X server Wacom input driver"
DESCRIPTION = "wacom is an X input driver and utilities for Wacom devices."
LICENSE = "GPL-2.0-or-later"

PV = "0.40.0"

RPM_NAME = "xf86-input-wacom-devel-0.40.0-3.9.aarch64.rpm"
RPM_HASH = "638430fec38d85c2e32d5841276583dd1dc1fc6910b3c210be777a69eb8bf0c324c19b079dc1f045d3d3264948543b366329a5302203b0b9e46f458739856a67"

RPROVIDES:${PN} += "pkgconfig-xorg-wacom \
x11-input-wacom-devel \
xf86-input-wacom-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
xf86-input-wacom"

inherit rpm
