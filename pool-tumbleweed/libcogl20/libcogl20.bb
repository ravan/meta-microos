SUMMARY = "An object oriented GL/GLES Abstraction/Utility Layer"
DESCRIPTION = "Cogl is a library for using 3D graphics hardware to draw \
pretty pictures."
LICENSE = "MIT"

PV = "1.22.8"

RPM_NAME = "libcogl20-1.22.8-3.7.aarch64.rpm"
RPM_HASH = "97b45875121530a9876373c6eb33c75e86cb8ce7201a4e306e9f9f464339d1bbe3ed33592352dd7e4247cb3317f9e688a06fff79b9de4b4394e300c26f8df8ed"

RPROVIDES:${PN} += "cogl \
libcogl-path.so.20 \
libcogl.so.20 \
libcogl20"

RDEPENDS:${PN} += "/sbin/ldconfig \
Mesa \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libX11.so.6 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libc.so.6 \
libcairo.so.2 \
libdrm.so.2 \
libgbm.so.1 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libwayland-server.so.0"

inherit rpm
