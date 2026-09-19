SUMMARY = "Haveged interface library"
DESCRIPTION = "Shared object for the haveged library. \
This package contains the haveged implementation of the HAVEGE \
algorithm and supporting features."
LICENSE = "GPL-3.0-only"

PV = "1.9.21"

RPM_NAME = "libhavege2-1.9.21-1.3.aarch64.rpm"
RPM_HASH = "0cb9811c24a9a299e5ca7c6e155bbe831c51bb2b6750547a6de161b7423df760bed9f114ad181f3478846cf3435c7db54ab2d7fe6df63c1a45dbc363c00b753e"

RPROVIDES:${PN} += "libhavege.so.2 \
libhavege2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
