SUMMARY = "An MS Windows Emulator"
DESCRIPTION = "Wine is a compatibility layer capable of running Windows \
applications. Instead of simulating internal Windows logic like a \
virtual machine or emulator, Wine translates Windows API calls into \
POSIX calls on-the-fly, eliminating the performance and memory \
penalties of other methods and allowing you to cleanly integrate \
Windows applications into your desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "10.0"

RPM_NAME = "wine-wow64-10.0-1.2.aarch64.rpm"
RPM_HASH = "7091a8ceebae887153a81ccd2d3678dbe0307f1eeaeaf4cc514fb2a936567485294f6283c88f5aa73a5e394ee75dbac51ceae96333773c7ac22f8c48da5853b0"

RPROVIDES:${PN} += "wine \
wine-32bit \
wine-mp3 \
wine-wow64"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libOSMesa.so.8 \
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
libavcodec.so.61 \
libavformat.so.61 \
libavutil.so.59 \
libc.so.6 \
libcapi20.so.3 \
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
