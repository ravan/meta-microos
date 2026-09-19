SUMMARY = "Flight Simulator"
DESCRIPTION = "The FlightGear project is working to create a sophisticated flight \
simulator framework for the development and pursuit of interesting \
flight simulator ideas. We are developing a solid basic sim that can be \
expanded and improved upon by anyone interested in contributing"
LICENSE = "GPL-2.0-only"

PV = "2024.1.7"

RPM_NAME = "FlightGear-2024.1.7-1.1.aarch64.rpm"
RPM_HASH = "df5931301a659bd773f7f874f9e1afb4765b6ed2fb42b1bbf6d78d7d5eb7c54e749a4c98ef27ade863cb0d4b2e718577661ced0562151da4a0c8c595cca80949"

RPROVIDES:${PN} += "FlightGear"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libOpenThreads.so.21 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libSimGearCore.so.2024.1.7 \
libSimGearScene.so.2024.1.7 \
libX11.so.6 \
libc.so.6 \
libdbus-1.so.3 \
libevent-2.1.so.7 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libosg.so.161 \
libosgDB.so.161 \
libosgGA.so.161 \
libosgTerrain.so.161 \
libosgText.so.161 \
libosgUtil.so.161 \
libosgViewer.so.161 \
libplibpu.so.0 \
libplibpuaux.so.0 \
libplibsg.so.0 \
libplibul.so.0 \
libspeex.so.1 \
libspeexdsp.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libudev.so.1 \
libz.so.1"

inherit rpm
