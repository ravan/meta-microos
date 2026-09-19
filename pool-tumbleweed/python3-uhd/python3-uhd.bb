SUMMARY = "Python bindings for uhd"
DESCRIPTION = "The UHD is the 'Universal Software Radio Peripheral' hardware driver. \
The goal of the UHD is to provide a host driver and API for current \
and future Ettus Research products. Users will be able to use the \
UHD driver standalone or with 3rd party applications. \
 \
This package contains Python bindings UHD."
LICENSE = "GPL-3.0-or-later"

PV = "4.10.0.0"

RPM_NAME = "python3-uhd-4.10.0.0-2.1.aarch64.rpm"
RPM_HASH = "245d5250dd19e171f51f9dc72f8cbe3ffb41ea96b65c8dcdb040a2ec9c1e0eb2105a7b36c29eb1cbfc1eb1f3f8a50629e70a3f9043e1671af7d2dffbab6a4775"

RPROVIDES:${PN} += "libpyuhd.cpython-313-aarch64-linux-gnu.so \
python3-uhd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
libuhd.so.4.10.0 \
python-abi"

inherit rpm
