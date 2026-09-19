SUMMARY = "GStreamer plugin for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications. \
 \
This package contains the GStreamer plugin for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugin-gstreamer-3.6.5-12.8.aarch64.rpm"
RPM_HASH = "9010b957f2754cada711711b754011f0a335393f4c8b99cbcba0d5a90895bf1e38687c266cf6304d5dcc9c87af42d49cc4f8e09752f817ed80b1156464c8c451"

RPROVIDES:${PN} += "OpenSceneGraph-plugin-gstreamer \
OpenSceneGraph-plugins-/usr/lib64/osgPlugins-3.6.5/osgdb-gstreamer.so \
OpenSceneGraphPlugin-ext-avi \
OpenSceneGraphPlugin-ext-mov"

RDEPENDS:${PN} += "libOpenThreads.so.21 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstapp-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libosg.so.161 \
libosgDB.so.161 \
libstdc++.so.6"

inherit rpm
