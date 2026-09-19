SUMMARY = "Library for HDR image and video manipulation"
DESCRIPTION = "The pfstools package is a set of command line (and one GUI) programs \
for reading, writing, manipulating and viewing high-dynamic range \
(HDR) images and video frames. All programs in the package exchange \
data using the pfs file format for HDR data. The concept of pfstools \
is similar to netpbm for low-dynamic range images."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "libpfs2-2.2.0-5.10.aarch64.rpm"
RPM_HASH = "72bab0feff66397e633383eb70ef62b751b037a1a3979fb6c8453f2929eccd37161870774da57bc5fedd20ef59747358b2f98e67dbd56c80e9b7b41386448f7a"

RPROVIDES:${PN} += "libpfs.so.2 \
libpfs2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
