SUMMARY = "Data extractor for data points from graphical plots"
DESCRIPTION = "xyscan is a tool for scientists in need of extracting data points, \
i.e. numeric values, from a plot."
LICENSE = "GPL-3.0-or-later"

PV = "4.68"

RPM_NAME = "xyscan-4.68-1.3.aarch64.rpm"
RPM_HASH = "07b073cde59539e8004bd634c61c2af75b2e2f8e4ece8816d5e2c4baca51d5879df84ac80447e50bb226e6c2feea044a79a1538701fb97453609ffc695bd4a4b"

RPROVIDES:${PN} += "xyscan"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpoppler-qt6.so.3 \
libstdc++.so.6"

inherit rpm
