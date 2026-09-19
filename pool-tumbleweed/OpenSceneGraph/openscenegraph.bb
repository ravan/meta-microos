SUMMARY = "3D graphics toolkit"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
OpenGL, freeing the developer from implementing and optimizing low \
level graphics calls, and provides many additional utilities for \
development of graphics applications."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-3.6.5-12.8.aarch64.rpm"
RPM_HASH = "e9771048888ca412e0d6db11d9be8808e5304b7bd161fe863f09e7c288e5c8e72908a09b01bb9e40d7d88a046c94d9084066e1cdcf41dab3209e15f9b83074c6"

RPROVIDES:${PN} += "OpenSceneGraph"

RDEPENDS:${PN} += "libOpenThreads.so.21 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libosg.so.161 \
libosgDB.so.161 \
libosgGA.so.161 \
libosgPresentation.so.161 \
libosgTerrain.so.161 \
libosgUtil.so.161 \
libosgViewer.so.161 \
libosgVolume.so.161 \
libstdc++.so.6"

inherit rpm
