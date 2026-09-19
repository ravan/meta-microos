SUMMARY = "GPU video filter library"
DESCRIPTION = "Movit is a library for video filters. It uses the GPU present in many \
computers to accelerate computation of common filters and \
transitions, facilitating real-time HD video editing. \
 \
This package contains the Movit shared library."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.1"

RPM_NAME = "libmovit8-1.7.1-1.13.aarch64.rpm"
RPM_HASH = "c4521ea6cb1a98a99e4e32eb07431cc413c9343583a193a457e4e3a098c82e8776197aaf7e57f68708886aeaade30af24e6448894ca263feae1b88bc0fbca061"

RPROVIDES:${PN} += "libmovit.so.8 \
libmovit8 \
movit \
movit8-data"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
