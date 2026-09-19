SUMMARY = "GDAL plugin for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications. \
 \
This package contains the GDAL plugin for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugin-gdal-3.6.5-12.8.aarch64.rpm"
RPM_HASH = "0f63ed815bac55f05080ace9513f1333d9ad8d8c3948aded225fde2662bb7c29a6d829c329914994c97d65cb42e7e5397729aed35648ec7380d86b3f8b90ad0b"

RPROVIDES:${PN} += "OpenSceneGraph-plugin-gdal \
OpenSceneGraph-plugins-/usr/lib64/osgPlugins-3.6.5/osgdb-gdal.so \
OpenSceneGraphPlugin-ext-gdal"

RDEPENDS:${PN} += "libOpenThreads.so.21 \
libc.so.6 \
libgcc-s.so.1 \
libgdal.so.39 \
libm.so.6 \
libosg.so.161 \
libosgDB.so.161 \
libosgTerrain.so.161 \
libosgUtil.so.161 \
libstdc++.so.6"

inherit rpm
