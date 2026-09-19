SUMMARY = "Omemo C Library"
DESCRIPTION = "The libomemo-c library is a forward secrecy protocol library written in C."
LICENSE = "GPL-3.0-only"

PV = "0.5.1"

RPM_NAME = "libomemo-c0-0.5.1-2.5.aarch64.rpm"
RPM_HASH = "55450cea97a3a8a7844ef1c641b952c674c20620c955114c0603a3cedc01ead0c6683a0fc6618f6a681eb17b3aae7a9beda578364fd64a04731c235bd0ce82cd"

RPROVIDES:${PN} += "libomemo-c.so.0 \
libomemo-c0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libprotobuf-c.so.1"

inherit rpm
