SUMMARY = "A screamingly fast Python 2 + 3 WSGI server written in C"
DESCRIPTION = "A screamingly fast Python 2 + 3 WSGI server written in C."
LICENSE = "BSD-2-Clause"

PV = "3.2.2"

RPM_NAME = "python314-bjoern-3.2.2-2.7.aarch64.rpm"
RPM_HASH = "df57110e186f1e2d929d7336b8fbd2b7f2b776fd15c5074bc073e92ea9e3e6050b67a02aa1a2a755deb61b40946215222c1e7598f84b2ac858d3b977b194e0d5"

RPROVIDES:${PN} += "python3.14dist-bjoern \
python314-bjoern \
python3dist-bjoern"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libev.so.4 \
python-abi"

inherit rpm
