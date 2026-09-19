SUMMARY = "A Geographic Information System (GIS)"
DESCRIPTION = "QGIS is a Geographic Information System (GIS). QGIS supports vector, \
raster, OWS and database formats. QGIS can be used to browse and \
create map data on the computer. It supports many common spatial data \
formats (e.g. ESRI ShapeFile, geotiff). QGIS supports plugins to do \
things like display tracks from a GPS."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "qgis-4.2.1-1.2.aarch64.rpm"
RPM_HASH = "53730b1a8d93b1aff41e2fefd9355ec3e37e2b0e5645e1f91bb606b58222e55ad6393cc2b203d9082bcb0ae6a118ed7650446151cda866a24d14e32ab19f29cb"

RPROVIDES:${PN} += "libauthmethod-apiheader.so \
libauthmethod-awss3.so \
libauthmethod-basic.so \
libauthmethod-esritoken.so \
libauthmethod-identcert.so \
libauthmethod-maptilerhmacsha256.so \
libauthmethod-oauth2.so \
libauthmethod-pkcs12.so \
libauthmethod-pkipaths.so \
libauthmethod-planetary-computer.so \
liblandingpage.so \
libplugin-geometrychecker.so \
libplugin-offlineediting.so \
libplugin-topology.so \
libprovider-arcgisfeatureserver.so \
libprovider-arcgisimageserver.so \
libprovider-arcgismapserver.so \
libprovider-delimitedtext.so \
libprovider-gpx.so \
libprovider-mdal.so \
libprovider-mssql.so \
libprovider-pdal.so \
libprovider-postgres.so \
libprovider-postgresraster.so \
libprovider-spatialite.so \
libprovider-virtuallayer.so \
libprovider-virtualraster.so \
libprovider-wcs.so \
libprovider-wfs.so \
libprovider-wms.so \
libqgis-3d.so.4.2.1 \
libqgis-analysis.so.4.2.1 \
libqgis-app.so.4.2.1 \
libqgis-core.so.4.2.1 \
libqgis-gui.so.4.2.1 \
libqgis-native.so.4.2.1 \
libqgis-server.so.4.2.1 \
libqgispython.so.4.2.1 \
libqsqlspatialite.so \
libwcs.so \
libwfs.so \
libwfs3.so \
libwms.so \
libwmts.so \
qgis"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libQt63DCore.so.6 \
libQt63DExtras.so.6 \
libQt63DInput.so.6 \
libQt63DLogic.so.6 \
libQt63DRender.so.6 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6MultimediaWidgets.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6QuickWidgets.so.6 \
libQt6SerialPort.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6UiTools.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libdraco.so.9 \
libexiv2.so.28 \
libexpat.so.1 \
libfcgi.so.0 \
libgcc-s.so.1 \
libgdal.so.39 \
libgeos-c.so.1 \
libgsl.so.28 \
libgslcblas.so.0 \
libhdf5.so.310 \
libm.so.6 \
libnetcdf.so.22 \
libpdalcpp.so.20 \
libpq.so.5 \
libproj.so.25 \
libprotobuf-lite.so.34.2.0 \
libpython3.13.so.1.0 \
libqca-qt6.so.2 \
libqscintilla2-qt6.so.15 \
libqt6keychain.so.1 \
libqwt-qt6.so.6.3 \
libspatialindex.so.6 \
libspatialite.so.8 \
libsqlite3.so.0 \
libstdc++.so.6 \
libxml2.so.16 \
libz.so.1 \
libzip.so.5 \
libzstd.so.1 \
pdal \
proj \
python3-GDAL \
python3-Jinja2 \
python3-OWSLib \
python3-PyQt6-QScintilla \
python3-PyYAML \
python3-Pygments \
python3-numpy \
python3-packaging \
python3-psycopg2 \
python3-termcolor \
qt6-sql-mysql \
qt6-sql-postgresql \
qt6-sql-sqlite"

inherit rpm
