SUMMARY = "C implementation of Constrained Application Protocol (CoAP)"
DESCRIPTION = "libcoap implements a lightweight application protocol for devices that are \
constrained their resources such as computing power, RF range, memory, \
bandwith, or network packet sizes. \
 \
This package contains the shared library."
LICENSE = "BSD-2-Clause"

PV = "4.3.5b"

RPM_NAME = "libcoap3-3-4.3.5b-1.4.aarch64.rpm"
RPM_HASH = "4a5b13a3f2fd2e9d44a2d8bfe8a2e183e3662366b4d60f770428b4287e2220d2f1b0af78d88da1c461a6927aee4c609ceeb6abe34d770f80d10e989452d0a979"

RPROVIDES:${PN} += "libcoap-3-openssl.so.3 \
libcoap3-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
