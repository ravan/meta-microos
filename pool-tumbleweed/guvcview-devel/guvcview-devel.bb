SUMMARY = "Development files for guvcview"
DESCRIPTION = "A GTK interface for capturing and viewing video from devices \
supported by the Linux UVC driver, although it should also work with \
any v4l2 compatible device. \
 \
This subpackage contains the header files for developing \
applications that want to make use of the GUVC libraries."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.2"

RPM_NAME = "guvcview-devel-2.2.2-1.7.aarch64.rpm"
RPM_HASH = "d2fda9dc131be6984d13eb3f3a2cfec0bebad62f3381773c26bcfe6518179ec448256cb2e2ac30b83e241862e6c8bae66707e2a1877699ef560f9e597230af7f"

RPROVIDES:${PN} += "guvcview-devel \
pkgconfig-libgviewaudio \
pkgconfig-libgviewencoder \
pkgconfig-libgviewrender \
pkgconfig-libgviewv4l2core"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libgviewaudio-2-2-2 \
libgviewencoder-2-2-2 \
libgviewrender-2-2-2 \
libgviewv4l2core-2-2-2 \
libpng-devel \
pkgconfig-alsa \
pkgconfig-gsl \
pkgconfig-libavcodec \
pkgconfig-libavutil \
pkgconfig-libpulse \
pkgconfig-libudev \
pkgconfig-libusb-1.0 \
pkgconfig-libv4l2 \
pkgconfig-portaudio-2.0 \
pkgconfig-sdl2"

inherit rpm
