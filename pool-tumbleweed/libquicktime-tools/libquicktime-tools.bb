SUMMARY = "Libquicktime Tools"
DESCRIPTION = "Tools for reading/writing quicktime movie files."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4+git20180804.fff99cd"

RPM_NAME = "libquicktime-tools-1.2.4+git20180804.fff99cd-9.7.aarch64.rpm"
RPM_HASH = "348590c1aa8a9d3c92f3f141eb7c4c9c2173ea3d3693507e0a2c3ab9f9535f204b431b5c9d591a480f88571e61f49e84e9fc51a4a95bdbdb38e8d49110763a3a"

RPROVIDES:${PN} += "libquicktime-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXext.so.6 \
libXt.so.6 \
libXv.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libquicktime \
libquicktime.so.0 \
libquicktime0"

inherit rpm
