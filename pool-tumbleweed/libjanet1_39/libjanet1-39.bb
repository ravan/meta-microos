SUMMARY = "Library for the lisp-like functional and imperative programming language"
DESCRIPTION = "This contains the library for Janet—a functional and imperative programming language."
LICENSE = "MIT"

PV = "1.39.0"

RPM_NAME = "libjanet1_39-1.39.0-1.6.aarch64.rpm"
RPM_HASH = "1548c27d4a9b68f2bd480a91169d12f8ae34e8ba227b14958a9487cbf0fec54307e3c6805dc727cba17eb5c75c08af06abe23759c3eab40186b384009a1e3c0d"

RPROVIDES:${PN} += "libjanet.so.1.39 \
libjanet1-39"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
