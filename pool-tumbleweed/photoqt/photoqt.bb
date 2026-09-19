SUMMARY = "A Qt-based image viewer"
DESCRIPTION = "PhotoQt is a configurable image viewer."
LICENSE = "GPL-2.0-or-later"

PV = "5.4.1"

RPM_NAME = "photoqt-5.4.1-1.2.aarch64.rpm"
RPM_HASH = "f5f61688e4f823b94ef733d7760d3b1878402fde9af8230cdd717a6ecf6c0ead2e5fe5317f409e21da4c472e7eb59d80378e8691af5f4f705df105d9858d4015"

RPROVIDES:${PN} += "photoqt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libIL.so.1 \
libMagick++-7.Q16HDRI.so.5 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6Pdf.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libarchive.so.13 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
liblcms2.so.2 \
libm.so.6 \
libmpv.so.2 \
libraw.so.25 \
libstdc++.so.6 \
libwayland-client.so.0 \
qt6-location \
qt6-multimedia \
qt6-positioning \
qt6-sql-sqlite"

inherit rpm
