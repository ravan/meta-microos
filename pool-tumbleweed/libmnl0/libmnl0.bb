SUMMARY = "Minimalistic Netlink communication library"
DESCRIPTION = "libmnl is a user-space library for Netlink developers. There are a \
lot of common tasks in parsing, validating, constructing of both the \
Netlink header and TLVs that are repetitive and easy to get wrong. \
This library provides helpers that allow for code reuse."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "libmnl0-1.0.5-2.8.aarch64.rpm"
RPM_HASH = "0c6167e03bc81f77c6733fd92f2b898d12e2c08af3baaa7c908426ea17fcb1ca937bb2d5b9a08d54a75c3849311e72192abfaa7e9d2ca565e8b5ed17491bcd5f"

RPROVIDES:${PN} += "libmnl.so.0 \
libmnl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
