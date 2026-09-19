SUMMARY = "A small set of data analysis classes for MC event generator validation analyses"
DESCRIPTION = "YODA is a small set of data analysis (specifically histogramming) \
classes being developed by MCnet members as a lightweight common \
system for MC event generator validation analyses. \
 \
This package provides the python binidings for YODA."
LICENSE = "GPL-2.0-only"

PV = "2.1.2"

RPM_NAME = "python3-YODA-2.1.2-1.5.aarch64.rpm"
RPM_HASH = "b48db6bc932b202c15013ef2766f17abcd72d830207cb2bee5968f91a21722df25a70d079eb9ed51b39849e21cdece5ef974f9081434c866c5217aa09a7558f9"

RPROVIDES:${PN} += "python-YODA \
python3-YODA"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libYODA-2-1-2 \
libYODA-2.1.2.so \
libc.so.6 \
libgcc-s.so.1 \
libhdf5.so.310 \
libm.so.6 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
