SUMMARY = "High Dynamic Range Image and Video manipulation tools"
DESCRIPTION = "The pfstools package is a set of command line (and one GUI) programs \
for reading, writing, manipulating and viewing high-dynamic range \
(HDR) images and video frames. All programs in the package exchange \
data using the pfs file format for HDR data. The concept of pfstools \
is similar to netpbm for low-dynamic range images."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-2.2.0-5.10.aarch64.rpm"
RPM_HASH = "1970be6671eadba0fe8503be44c04cef9b502a7936ef704f891cf1b2af182200f948e05b8cc9936351d6b1c4eeb4b92c9fb2052eb5c935da179bf74d08038fec"

RPROVIDES:${PN} += "pfstools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
dcraw \
ld-linux-aarch64.so.1 \
libMagick++-7.Q16HDRI.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libnetpbm.so.11 \
libpfs.so.2 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
