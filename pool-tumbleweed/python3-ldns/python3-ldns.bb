SUMMARY = "Python3 bindings for ldns"
DESCRIPTION = "Python bindings for the ldns library"
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "python3-ldns-1.9.2-1.4.aarch64.rpm"
RPM_HASH = "64933cf41d31d6a04925b072bd3be4e4f3b534a5dd94ac335f3eab95628a97033f939ac47dd343eff35f7d33191520533c69575205f3ecf50a9cc96ff017ce7b"

RPROVIDES:${PN} += "python3-ldns"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldns.so.3 \
libldns3 \
libpython3.13.so.1.0 \
python-abi"

inherit rpm
