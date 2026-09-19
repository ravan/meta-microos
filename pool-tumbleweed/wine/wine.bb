SUMMARY = "An MS Windows Emulator"
DESCRIPTION = "Wine is a compatibility layer capable of running Windows \
applications. Instead of simulating internal Windows logic like a \
virtual machine or emulator, Wine translates Windows API calls into \
POSIX calls on-the-fly, eliminating the performance and memory \
penalties of other methods and allowing you to cleanly integrate \
Windows applications into your desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "11.17"

RPM_NAME = "wine-11.17-1.1.aarch64.rpm"
RPM_HASH = "1d13c6eefbb02faefd9d79cf48b7c8ec77988a8633b0700fc5756410a98dd1ef8667f7296dece3f19978e6336df333587e8438d50dbe60fea782df3fb1b2ba74"

RPROVIDES:${PN} += "bundled-FAudio \
bundled-capstone \
bundled-fluidsynth \
bundled-jpeg \
bundled-libgsm \
bundled-libjxr \
bundled-liblcms2 \
bundled-libpng \
bundled-libxml2 \
bundled-libxslt \
bundled-mpg123 \
bundled-musl \
bundled-openldap2 \
bundled-tiff \
bundled-tomcrypt \
bundled-tommath \
bundled-vkd3d \
bundled-zlib \
wine \
wine-mp3"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libOpenCL.so.1 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libXxf86vm.so.1 \
libasound.so.2 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcups.so.2 \
libdbus-1.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libgssapi-krb5.so.2 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvideo-1.0.so.0 \
libkrb5.so.3 \
libm.so.6 \
libnetapi.so.1 \
libodbc.so.2 \
libpcap.so.1 \
libpcsclite.so.1 \
libpulse.so.0 \
libsane.so.1 \
libudev.so.1 \
libusb-1.0.so.0 \
libv4l2.so.0 \
libvulkan.so.1 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libxkbcommon.so.0 \
libxkbregistry.so.0 \
samba-winbind"

inherit rpm
