SUMMARY = "Python bindings for libgensio"
DESCRIPTION = "Python bindings for libgensio, a library for stream and packet I/O \
abscration."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "3.0.4"

RPM_NAME = "python3-gensio-3.0.4-1.1.aarch64.rpm"
RPM_HASH = "44228fa12b5374025467a8c78f85a4a2ecd1e58d59a31dd8568094a417c212ad5b1af7aeababd5179f5c8aa30a0afd66bfec98eed975bf4506449ce729609573"

RPROVIDES:${PN} += "python3-gensio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgensio-python-swig.so.14 \
libgensio.so.14 \
libgensiocpp.so.14 \
libgensiomdns.so.14 \
libgensiomdnscpp.so.14 \
libgensioosh.so.14 \
libgensiooshcpp.so.14 \
libstdc++.so.6 \
python-abi"

inherit rpm
