SUMMARY = "Library for listing information about files opened by process"
DESCRIPTION = "This package contains a library for listing information about files opened by process. \
It allows accessing the functionality of the lsof command from C functions without \
spawning a subprocess."
LICENSE = "Zlib"

PV = "4.99.7"

RPM_NAME = "liblsof0-4.99.7-1.3.aarch64.rpm"
RPM_HASH = "cc7d6fa4ea835ae42b2a77b2c363d28c7ab57a713a202f8ea711facc27aa9d0c9d592038914fad267c38ed8dd5a5e2ae8a0f7c88a434dda059488a73e8bb141f"

RPROVIDES:${PN} += "liblsof.so.0 \
liblsof0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
