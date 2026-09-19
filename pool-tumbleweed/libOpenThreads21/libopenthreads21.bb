SUMMARY = "Shared libraries for OpenSceneGraph"
DESCRIPTION = "The OpenSceneGraph is a graphics toolkit for the development of \
graphic applications such as flight simulators, games, virtual \
reality and scientific visualization. Based around the concept of a \
scene graph, it provides an object-oriented framework on top of \
OpenGL. \
 \
This package contains the shared libraries for OpenSceneGraph."
LICENSE = "LGPL-2.1-only-with-WxWindows-exception-3.1"

PV = "3.6.5"

RPM_NAME = "libOpenThreads21-3.6.5-12.8.aarch64.rpm"
RPM_HASH = "7f8758a2dbcf3504c6a2b05f36edf340e7ec63c2e9870eb7d75e0a392ec4402c9706e0e57cd274e778d4438d8c323e0cb6ca693666c6fe33853bb96aa574ba14"

RPROVIDES:${PN} += "libOpenThreads.so.21 \
libOpenThreads21"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
