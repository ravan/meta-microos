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

RPM_NAME = "libOpenThreads-devel-3.6.5-12.8.aarch64.rpm"
RPM_HASH = "9c4af1100a74c69321113c326930c2e224e9eacbd89983e7e9a6c6249841a9921af6ba693b158c281d2f70fff46562d7488f14f4c240c7720996659de7a346ad"

RPROVIDES:${PN} += "libOpenThreads-devel \
pkgconfig-openthreads"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOpenThreads21"

inherit rpm
