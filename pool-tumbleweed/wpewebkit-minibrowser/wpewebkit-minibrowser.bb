SUMMARY = "MiniBrowser from WebKit"
DESCRIPTION = "A small test browswer from webkit, useful for testing features and \
embedded mini browsers."
LICENSE = "BSD-3-Clause & LGPL-2.1-only"

PV = "2.52.6"

RPM_NAME = "wpewebkit-minibrowser-2.52.6-1.1.aarch64.rpm"
RPM_HASH = "e1c7ba9c3cebfb1acb46221e387e6ac0a562d68f020ba9436a4b92810f3eda2accd3d49a9c32b7de0d8e711a310bac7b13a2cb3c3d8a0677b4eec9260fc574ef"

RPROVIDES:${PN} += "wpewebkit-minibrowser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libWPEBackend-fdo-1.0.so.1 \
libWPEWebKit-2-0-1 \
libWPEWebKit-2.0.so.1 \
libatk-1.0.so.0 \
libatk-bridge-2.0.so.0 \
libc.so.6 \
libepoxy.so.0 \
libfreetype.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libwayland-server.so.0 \
libwpe-1.0.so.1 \
libxkbcommon.so.0"

inherit rpm
