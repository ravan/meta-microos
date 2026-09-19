SUMMARY = "CFD General Notation System library"
DESCRIPTION = "The CFD General Notation System (CGNS) provides a general, portable, \
and extensible standard for the storage and retrieval of computational \
fluid dynamics (CFD) analysis data."
LICENSE = "Zlib"

PV = "4.4.0"

RPM_NAME = "libcgns4_4-4.4.0-2.13.aarch64.rpm"
RPM_HASH = "220b84e482d061c3180a282a979bd036682c3666430836e18313e0e11266ff503f163bcd5ad3d4d12425ac11991675b159fae0dd76bb0071a554e6fdbea5e609"

RPROVIDES:${PN} += "libcgns \
libcgns.so.4.4 \
libcgns4-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.310"

inherit rpm
