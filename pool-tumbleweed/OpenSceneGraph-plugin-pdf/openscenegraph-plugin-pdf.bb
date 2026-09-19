SUMMARY = "PDF plugin for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications. \
 \
This package contains the Poppler based PDF plugin for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugin-pdf-3.6.5-12.8.aarch64.rpm"
RPM_HASH = "0b58e377ac1a78468832e16c8fef9fdd75881b8238f11de02b3cc8e93613cd15ddeaa8117b98f5b94cf2519c5333ecdf14df87206ff5251df26f8009f9995e15"

RPROVIDES:${PN} += "OpenSceneGraph-plugin-pdf \
OpenSceneGraph-plugins-/usr/lib64/osgPlugins-3.6.5/osgdb-pdf.so \
OpenSceneGraphPlugin-ext-pdf"

RDEPENDS:${PN} += "libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libosg.so.161 \
libosgDB.so.161 \
libosgWidget.so.161 \
libpoppler-glib.so.8 \
libstdc++.so.6"

inherit rpm
