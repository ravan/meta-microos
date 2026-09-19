SUMMARY = "Library with several forward error correction (FEC) functions"
DESCRIPTION = "A library that provides a set of functions that implement several \
popular forward error correction (FEC) algorithms and several low-level routines \
useful in modems implemented with digital signal processing (DSP)."
LICENSE = "LGPL-2.1-only"

PV = "3.0.0+git.20160910"

RPM_NAME = "libfec3-3.0.0+git.20160910-6.8.aarch64.rpm"
RPM_HASH = "4e1e68f186230461ac6a39c979baab105d6be38bd2cd37af16a5bdad879ea3b3a5a08d203f1a2a51947d93cb02ff3273bf899434c838f0867a5141ba4f5ad9b0"

RPROVIDES:${PN} += "libfec.so.3 \
libfec3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
