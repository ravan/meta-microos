SUMMARY = "Simulator Construction Gear"
DESCRIPTION = "SimGear is a set of open-source libraries designed to be used as building \
blocks for quickly assembling 3D simulations, games, and visualization \
applications. \
 \
SimGear is developed as part of the FlightGear project and used by the \
FlightGear flight simulator and many of its related utilities."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later & MIT"

PV = "2024.1.7"

RPM_NAME = "libSimGearCore-2024_1_7-2024.1.7-1.1.aarch64.rpm"
RPM_HASH = "5f77e7e7158cd0e23d07fc08686781d9d4da27891d962fe3aabd4a9fc569f4ded1fe45c21ad67b3503e2bdea7343e615da4cc7f945e6124eb63dcde521bbf960"

RPROVIDES:${PN} += "libSimGearCore-2024-1-7 \
libSimGearCore.so.2024.1.7 \
libSimGearScene.so.2024.1.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
OpenSceneGraph-plugins \
ld-linux-aarch64.so.1 \
libGLX.so.0 \
libOpenGL.so.0 \
libOpenThreads.so.21 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcares.so.2 \
libcurl.so.4 \
libexpat.so.1 \
libgcc-s.so.1 \
liblzma.so.5 \
libm.so.6 \
libopenal.so.1 \
libosg.so.161 \
libosgDB.so.161 \
libosgGA.so.161 \
libosgParticle.so.161 \
libosgSim.so.161 \
libosgTerrain.so.161 \
libosgText.so.161 \
libosgUtil.so.161 \
libstdc++.so.6 \
libswscale.so.9 \
libz.so.1"

inherit rpm
