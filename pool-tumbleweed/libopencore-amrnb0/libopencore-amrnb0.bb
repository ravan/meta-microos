SUMMARY = "Shared library part of opencore-amr"
DESCRIPTION = "Library of OpenCORE Framework implementation of Adaptive Multi Rate \
Narrowband speech codec."
LICENSE = "Apache-2.0"

PV = "0.1.6"

RPM_NAME = "libopencore-amrnb0-0.1.6-1.14.aarch64.rpm"
RPM_HASH = "6b33a175cbee5e68e3415c962c21dc11bdde19cdc8e9fbf847fb45026b754e6671176927f25482a2e89ce684854ab7fc444f6b8e8108913837e2ee363b4c4c86"

RPROVIDES:${PN} += "libopencore-amrnb.so.0 \
libopencore-amrnb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
