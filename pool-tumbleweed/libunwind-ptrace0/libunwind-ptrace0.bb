SUMMARY = "Call chain detection library for ptraced processes"
DESCRIPTION = "A C programming interface (API) to determine the call chains of \
another process by means of using ptrace(2) on it."
LICENSE = "MIT"

PV = "1.8.3"

RPM_NAME = "libunwind-ptrace0-1.8.3-3.3.aarch64.rpm"
RPM_HASH = "e07172bd4410ce2e25c8668586441a85601a48d0f41b85a6f8e23da81c777e4448d0ee94f506611af37ec5a1038eb539e8b39c8244762fd812378475c2d258d1"

RPROVIDES:${PN} += "libunwind-ptrace.so.0 \
libunwind-ptrace0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5 \
libunwind-aarch64.so.8"

inherit rpm
