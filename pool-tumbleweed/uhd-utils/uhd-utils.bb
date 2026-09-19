SUMMARY = "Utility programs for USRP hardware"
DESCRIPTION = "The UHD is the 'Universal Software Radio Peripheral' hardware driver. \
The goal of the UHD is to provide a host driver and API for current \
and future Ettus Research products. Users will be able to use the \
UHD driver standalone or with 3rd party applications. \
 \
This package contains utility programs for handling USRP frontens"
LICENSE = "GPL-3.0-or-later"

PV = "4.10.0.0"

RPM_NAME = "uhd-utils-4.10.0.0-2.1.aarch64.rpm"
RPM_HASH = "a5fe9f1491bcca28ca40dcd08c6dc193c735d28fbc92f616e6504b477b76881964d4b6d2ac62a2cb2604555d709c14b63b61898a2e8e33f6c6a61a006b93e226"

RPROVIDES:${PN} += "uhd-utils"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libuhd.so.4.10.0 \
python3-uhd"

inherit rpm
