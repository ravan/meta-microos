SUMMARY = "Library files for laszip"
DESCRIPTION = "A free product of rapidlasso GmbH - quickly turns bulky LAS files into \
compact LAZ files without information loss. LASzip is a compression library that \
was developed by Martin Isenburg for compressing ASPRS LAS format data in his \
LAStools. It has been provided as an LGPL-licensed stand-alone software library \
to allow other softwares that handle LAS data to read and write LASzip-compressed \
data. The BSD-licensed libLAS and the LGPL-licensed LASlib can take advantage of \
LASzip to read and write compressed data. \
 \
This package contain only the dynamic build."
LICENSE = "LGPL-2.1-or-later"

PV = "3.5.0"

RPM_NAME = "liblaszip8-3.5.0-1.1.aarch64.rpm"
RPM_HASH = "b6794f7a770b3ec1eb7f4cdf65cda3923ed214198d17c9eebcf9d1b2b2715a4a95491e5a916cc4ef4e67651867acd4c527b5b43e82b4b25ec9164372c1426988"

RPROVIDES:${PN} += "liblaszip.so.8 \
liblaszip8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
