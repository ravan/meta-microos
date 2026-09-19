SUMMARY = "FIDO U2F and FIDO 2.0 protocols"
DESCRIPTION = "This library supports the FIDO U2F and FIDO 2.0 protocols for \
communicating with a USB authenticator via the \
Client-to-Authenticator Protocol (CTAP 1 and 2)."
LICENSE = "BSD-2-Clause"

PV = "1.16.0"

RPM_NAME = "libfido2-1-1.16.0-2.1.aarch64.rpm"
RPM_HASH = "8aae7fe50f9da56fe946b5016c05ef473f6a6ffa14d90c42a918c8b9b470ec265fddef102202abbaf7d338cf50ee5985f3e155bd7d22277b73e8142e0dff20de"

RPROVIDES:${PN} += "libfido2 \
libfido2-1 \
libfido2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcbor.so.0.14 \
libcrypto.so.3 \
libudev.so.1 \
libz.so.1"

inherit rpm
