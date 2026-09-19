SUMMARY = "Shared library for woff2"
DESCRIPTION = "Web Open Font Format (WOFF) 2.0 is an update to the existing WOFF \
1.0 with improved compression that is achieved by using the Brotli \
algorithm. The primary purpose of the WOFF2 format is to \
efficiently package fonts linked to Web documents by means of CSS \
@font-face rules. \
 \
This package contains the shared library for woff2."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "libwoff2dec1_0_2-1.0.2-6.5.aarch64.rpm"
RPM_HASH = "7327ad541aee4f55aca15ba8156d8824ff71df5988dfad8c023d0bf73edd758e6be85ed960263b84180769b8ae1168f02108faab9e772548a67fc84862dcd850"

RPROVIDES:${PN} += "libwoff2dec.so.1.0.2 \
libwoff2dec1-0-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwoff2common.so.1.0.2"

inherit rpm
