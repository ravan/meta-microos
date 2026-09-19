SUMMARY = "Example programs for UHD"
DESCRIPTION = "The UHD is the 'Universal Software Radio Peripheral' hardware driver. \
The goal of the UHD is to provide a host driver and API for current \
and future Ettus Research products. Users will be able to use the \
UHD driver standalone or with 3rd party applications. \
 \
This package contains example programs for UHD."
LICENSE = "GPL-3.0-or-later"

PV = "4.10.0.0"

RPM_NAME = "uhd-examples-4.10.0.0-2.1.aarch64.rpm"
RPM_HASH = "cda299d06af863af830b665a2d2a64d4c31d871280ab207718ee3359d1b35e704c64161192c65148834903977fbee73f87e8b991018caf9f40b8b30c7b1d21e2"

RPROVIDES:${PN} += "uhd-examples"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libuhd.so.4.10.0"

inherit rpm
