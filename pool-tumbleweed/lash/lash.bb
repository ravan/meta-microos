SUMMARY = "Linux Audio Session Handler"
DESCRIPTION = "LASH (formerly LADCCA) is a session management system for JACK and ALSA \
audio applications on GNU/Linux. Its aim is to allow you to have many \
different audio programs running at once and to save the setup, close \
them down, then reload the setup at some other time."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "lash-0.5.4-5.7.aarch64.rpm"
RPM_HASH = "361fe28e8edb78dec72273e45bc4adb072cd32b603c5f7ea20092c46062d015e985285e5edc55ccaf09aee247d446b7800a22c1612f2916af94e86f75e0d4839"

RPROVIDES:${PN} += "lash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjack.so.0 \
liblash.so.1 \
libm.so.6 \
libreadline.so.8 \
libuuid.so.1 \
libxml2.so.16"

inherit rpm
