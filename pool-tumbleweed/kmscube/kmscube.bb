SUMMARY = "Demo for bare metal graphics"
DESCRIPTION = "kmscube is a little demonstration program for how to drive bare metal graphics \
without a compositor like X11, wayland or similar, using DRM/KMS (kernel mode \
setting), GBM (graphics buffer manager) and EGL for rendering content using \
OpenGL or OpenGL ES."
LICENSE = "MIT"

PV = "0.0.0.git20230926.96d63eb"

RPM_NAME = "kmscube-0.0.0.git20230926.96d63eb-1.12.aarch64.rpm"
RPM_HASH = "b56c3a30bf5419d057540d3f213cd392ddd17c995b491b2fc98497fdfacffee2fee9e09cf9aa47b85c4c6f9831bb9c00e2a5b12a91e2f23c117ab3525e60d817"

RPROVIDES:${PN} += "kmscube"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstapp-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libm.so.6 \
libpng16.so.16"

inherit rpm
