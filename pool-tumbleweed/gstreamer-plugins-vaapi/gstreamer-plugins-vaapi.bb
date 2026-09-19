SUMMARY = "Gstreamer VA-API plugins"
DESCRIPTION = "gstreamer-vaapi is a collection of GStreamer plugins and helper \
libraries that allow hardware accelerated video decoding through \
VA-API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.11"

RPM_NAME = "gstreamer-plugins-vaapi-1.26.11-1.4.aarch64.rpm"
RPM_HASH = "349446f8cc21fa570dcb0fcbac8d433f2bd1ea7368bc8d95eb82f4e31a62814274ea5832a8e98d9de73962f91ecfe4f57c8219bfb23b0adbebdedd4afb7d3c02"

RPROVIDES:${PN} += "gstreamer-plugins-vaapi \
libgstvaapi.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libGLESv2.so.2 \
libOpenGL.so.0 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstcodecparsers-1.0.so.0 \
libgstgl-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libm.so.6 \
libudev.so.1 \
libva-drm.so.2 \
libva-wayland.so.2 \
libva-x11.so.2 \
libva.so.2 \
libwayland-client.so.0"

inherit rpm
