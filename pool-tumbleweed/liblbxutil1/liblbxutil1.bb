SUMMARY = "Low Bandwith X extension utility routines"
DESCRIPTION = "liblbxutil is a library of routines for LBX (Low Bandwidth X) \
extension support shared between the lbxproxy program and an \
LBX-supporting X server."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "liblbxutil1-1.1.0-14.9.aarch64.rpm"
RPM_HASH = "2f0cb4bdda957e1e85569224a26ffa747d83084a19d3856e9370642252f91430b4dab01cd84d809e224234c52e37630145829de3d66ec3b440744fceed1efdf5"

RPROVIDES:${PN} += "liblbxutil.so.1 \
liblbxutil1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
