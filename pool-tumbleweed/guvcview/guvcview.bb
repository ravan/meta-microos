SUMMARY = "GTK+ UVC Viewer and Capturer"
DESCRIPTION = "A GTK interface for capturing and viewing video from devices \
supported by the Linux UVC driver, although it should also work with \
any v4l2 compatible device."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.2"

RPM_NAME = "guvcview-2.2.2-1.7.aarch64.rpm"
RPM_HASH = "f3f7ef261b134232057f73b5ff9adef45d92b55ee09219af2551399d1f798f2df497233680f9a6e60b2d44865b859bd549d625f1a15e355a9348680d087d681b"

RPROVIDES:${PN} += "guvcview"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgviewaudio.so.2 \
libgviewencoder.so.2 \
libgviewrender.so.2 \
libgviewv4l2core.so.2 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
