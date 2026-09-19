SUMMARY = "C library for quantum-resistant cryptographic algorithms"
DESCRIPTION = "liboqs is a C library for quantum-resistant cryptographic algorithms. \
See the bundled README.md for particular limitations on intended use."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "liboqs9-0.16.0-3.1.aarch64.rpm"
RPM_HASH = "e0c6149c03366803c07c5b53fa1613172922b86850288a583b803d5cbb96d33a40e945509c5e8bc85e8585afecc89a27fd09ff8c0dc45a40f40f140eb30d7d50"

RPROVIDES:${PN} += "liboqs.so.9 \
liboqs9"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcrypto.so.3"

inherit rpm
