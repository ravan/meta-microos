SUMMARY = "Shared library to query and update monitor settings"
DESCRIPTION = "Shared library version of ddcutil, exposing a C API. \
 \
ddcutil communicates with monitors implementing MCCS (Monitor Control Command \
Set), using either the DDC/CI protocol on the I2C bus or as a Human Interface \
Device on USB."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.7"

RPM_NAME = "libddcutil5-2.2.7-1.1.aarch64.rpm"
RPM_HASH = "e43782ec41ee976545f0e55d16a1693921a32c429c1bcd614fca552eaeff89ef8227c61209a8a08a354cfc7fe3b2a804f10ba2866519099ce553459eed61d167"

RPROVIDES:${PN} += "libddcutil.so.5 \
libddcutil5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXrandr.so.2 \
libacl.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdrm.so.2 \
libglib-2.0.so.0 \
libjansson.so.4 \
libudev.so.1 \
libusb-1.0.so.0"

inherit rpm
