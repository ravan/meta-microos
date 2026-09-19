SUMMARY = "GRASS Support Libraries for QGIS"
DESCRIPTION = "GRASS plugin for QGIS required to interface with GRASS system."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "qgis-plugin-grass-4.2.1-1.2.aarch64.rpm"
RPM_HASH = "7d4e27a767f13cead08ad48e83fed83227ba8e9c95458f70c7222b921a1d7f8d99ebb287d6af5253c877a36490771cee14c12bf79aa2c9edf677e926ff9fc954"

RPROVIDES:${PN} += "libplugin-grass8.so \
libprovider-grass8.so \
libprovider-grassraster8.so \
libqgisgrass8.so.4.2.1 \
qgis-plugin-grass"

RDEPENDS:${PN} += "/sbin/ldconfig \
grass \
grass-doc \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgrass-dbmibase.8.5.so \
libgrass-dbmiclient.8.5.so \
libgrass-gis.8.5.so \
libgrass-gproj.8.5.so \
libgrass-imagery.8.5.so \
libgrass-raster.8.5.so \
libgrass-vector.8.5.so \
libm.so.6 \
libqgis-app.so.4.2.1 \
libqgis-core.so.4.2.1 \
libqgis-gui.so.4.2.1 \
libstdc++.so.6 \
qgis"

inherit rpm
