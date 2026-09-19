SUMMARY = "Infiniband Data Model library"
DESCRIPTION = "This package contains shared libraries for the IB utils."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.5.7.0.2"

RPM_NAME = "libibdm1-1.5.7.0.2-12.9.aarch64.rpm"
RPM_HASH = "ecc1d88ff86dbf8c49aa65ef5dd042107230943d3f3de487e7213c354e70627e143687dba170a69a75d49ab761559daef99e1d2ec9362e826348062c790f12f5"

RPROVIDES:${PN} += "libibdm.so.1 \
libibdm1 \
libibdmcom.so.1 \
libibis.so.1 \
libibsysapi.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopensm.so.9 \
libosmcomp.so.5 \
libosmvendor.so.5 \
libstdc++.so.6 \
libtcl8.6.so"

inherit rpm
