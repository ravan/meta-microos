SUMMARY = "The UHD driver"
DESCRIPTION = "The UHD is the 'Universal Software Radio Peripheral' hardware driver. \
The goal of the UHD is to provide a host driver and API for current \
and future Ettus Research products. Users will be able to use the \
UHD driver standalone or with 3rd party applications."
LICENSE = "GPL-3.0-or-later"

PV = "4.10.0.0"

RPM_NAME = "libuhd4_10_0-4.10.0.0-2.1.aarch64.rpm"
RPM_HASH = "72752365f0da4eeb2aa67a49a9c2e5713dcde82056716e953e607f6108ddd3108081fab453c4ca88e75b95274f7229ee2f46c68fb9aecf3b1e9ddb8afddf353e"

RPROVIDES:${PN} += "libuhd.so.4.10.0 \
libuhd4-10-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-chrono.so.1.91.0 \
libboost-serialization.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
libusb-1.0.so.0 \
shadow \
uhd-udev"

inherit rpm
