SUMMARY = "VolView plugin for Orthanc"
DESCRIPTION = "Plugin to access KitWares VolView viewer from Orthanc \
The homepage of VolView can be found at: \
https://volview.kitware.com/ \
The source code of VolView is available at: \
https://github.com/Kitware/VolView"
LICENSE = "GPL-2.0-or-later"

PV = "1.3"

RPM_NAME = "orthanc-volview-1.3-1.9.aarch64.rpm"
RPM_HASH = "d806cc6ea8d1896feeee600b3f241ae80b92b7efc9490bf34295d415d3dda094f535016be803b472ad6184ef0e3dc9cc1131e7341f970363ad6b964e0595e0ff"

RPROVIDES:${PN} += "libOrthancVolView.so.1.3 \
orthanc-volview"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libstdc++.so.6 \
libz.so.1 \
orthanc"

inherit rpm
