SUMMARY = "Plugins for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
OpenGL. \
 \
This package contains some plugins for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "OpenSceneGraph-plugins-3.6.5-12.8.aarch64.rpm"
RPM_HASH = "a92ed5b3a468587d7705ccc00aa65e981224f2c150f9a2787c58097c5c719e9b6d06bb4affc979c2c31354cd3ec7485dd05ccde37a4577d88b2b0f19a0423e18"

RPROVIDES:${PN} += "OpenSceneGraph-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libOpenThreads.so.21 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libdcmdata.so.20 \
libdcmimage.so.20 \
libdcmimgle.so.20 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgif.so.7 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libofstd.so.20 \
libosg.so.161 \
libosgAnimation.so.161 \
libosgDB.so.161 \
libosgFX.so.161 \
libosgGA.so.161 \
libosgManipulator.so.161 \
libosgParticle.so.161 \
libosgPresentation.so.161 \
libosgShadow.so.161 \
libosgSim.so.161 \
libosgTerrain.so.161 \
libosgText.so.161 \
libosgUI.so.161 \
libosgUtil.so.161 \
libosgViewer.so.161 \
libosgVolume.so.161 \
libosgWidget.so.161 \
libpng16.so.16 \
librsvg-2.so.2 \
libstdc++.so.6 \
libvncclient.so.1 \
libz.so.1"

inherit rpm
