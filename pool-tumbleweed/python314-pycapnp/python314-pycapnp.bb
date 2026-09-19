SUMMARY = "Cython wrapping of the C++ Cap'n Proto library"
DESCRIPTION = "A cython wrapping of the C++ Cap'n Proto library."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python314-pycapnp-2.0.0-3.11.aarch64.rpm"
RPM_HASH = "034c736751c263288f33e7468ef125f6944d25ff0aa2be04b477a6844a6ebbe204feec32aa792c675330096b29486294c71e1352b103c14c96dd74ba472e4930"

RPROVIDES:${PN} += "python3.14dist-pycapnp \
python314-pycapnp \
python3dist-pycapnp"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcapnp-rpc.so.1.5.0 \
libcapnp.so.1.5.0 \
libcapnpc.so.1.5.0 \
libgcc-s.so.1 \
libkj-async.so.1.5.0 \
libkj.so.1.5.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
