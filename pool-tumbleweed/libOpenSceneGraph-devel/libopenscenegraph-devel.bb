SUMMARY = "OpenSceneGraph development files"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
OpenGL. \
 \
This package contains the header and development files for \
OpenSceneGraph."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "libOpenSceneGraph-devel-3.6.5-12.8.aarch64.rpm"
RPM_HASH = "ac99b878ebb35d98db1066db0fb5279b6d844d0a78fab3b4dc1ba859bebb27615f42f72a6b8ae1334ab0bbb3c4864754a22e1541f119a720cd60a9a7a51f537c"

RPROVIDES:${PN} += "libOpenSceneGraph-devel \
pkgconfig-openscenegraph \
pkgconfig-openscenegraph-osg \
pkgconfig-openscenegraph-osgAnimation \
pkgconfig-openscenegraph-osgDB \
pkgconfig-openscenegraph-osgFX \
pkgconfig-openscenegraph-osgGA \
pkgconfig-openscenegraph-osgManipulator \
pkgconfig-openscenegraph-osgParticle \
pkgconfig-openscenegraph-osgShadow \
pkgconfig-openscenegraph-osgSim \
pkgconfig-openscenegraph-osgTerrain \
pkgconfig-openscenegraph-osgText \
pkgconfig-openscenegraph-osgUtil \
pkgconfig-openscenegraph-osgViewer \
pkgconfig-openscenegraph-osgVolume \
pkgconfig-openscenegraph-osgWidget"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
curl-devel \
freeglut-devel \
giflib-devel \
libOpenSceneGraph161 \
libOpenThreads-devel \
libjpeg-devel \
libpng-devel \
pkgconfig-freetype2 \
pkgconfig-librsvg-2.0 \
pkgconfig-libtiff-4 \
pkgconfig-openscenegraph-osg \
pkgconfig-openscenegraph-osgDB \
pkgconfig-openscenegraph-osgGA \
pkgconfig-openscenegraph-osgText \
pkgconfig-openscenegraph-osgUtil \
pkgconfig-openscenegraph-osgViewer \
pkgconfig-openthreads \
pkgconfig-poppler-glib \
pkgconfig-sdl2 \
pkgconfig-xrandr"

inherit rpm
