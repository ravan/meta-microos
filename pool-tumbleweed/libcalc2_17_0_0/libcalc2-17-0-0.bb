SUMMARY = "Arbitrary precision math library"
DESCRIPTION = "Part of the calc release consists of an arbitrary precision math link \
library.  This link library is used by the calc program to perform its \
own calculations.  If you wish, you can ignore the calc program entirely \
and call the arbitrary precision math routines from your own C programs."
LICENSE = "LGPL-2.1-only"

PV = "2.17.0.0"

RPM_NAME = "libcalc2_17_0_0-2.17.0.0-1.2.aarch64.rpm"
RPM_HASH = "c5fe680421a91bb07d3f04ac5ec72d738d5f650d79d126b305fee35d878abd9295433b333b07a49d9944cf3afb715b10c468f4a02ac3fd59b0e3efb19d0c1a9f"

RPROVIDES:${PN} += "libcalc.so.2.17.0.0 \
libcalc2-17-0-0 \
libcustcalc.so.2.17.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8"

inherit rpm
