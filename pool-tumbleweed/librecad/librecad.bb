SUMMARY = "Computer-aided design (CAD) software package for 2D design and drafting"
DESCRIPTION = "LibreCAD is a Qt Computer-aided design (CAD) software package for 2D design \
and drafting."
LICENSE = "(Apache-2.0 | SUSE-GPL-3.0+-with-font-exception) & GPL-2.0-only"

PV = "2.2.1.5"

RPM_NAME = "librecad-2.2.1.5-1.1.aarch64.rpm"
RPM_HASH = "1aa4495c23fcde1fd51b3a2d14db01129bb027c7a8697e659c06b21ff393bcbcda848781ccb5ffd9b90c9450c04684ad0fa707b7bed91eb928594b3aa0da8a63"

RPROVIDES:${PN} += "libalign.so \
libasciifile.so \
libcircletools.so \
libdivide.so \
libgear.so \
liblist.so \
libpicfile.so \
libplotequation.so \
libpointstocsv.so \
librecad \
libsameprop.so \
libsample.so"

RDEPENDS:${PN} += "desktop-file-utils \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmuparser.so.2.3.5 \
libstdc++.so.6 \
shared-mime-info"

inherit rpm
