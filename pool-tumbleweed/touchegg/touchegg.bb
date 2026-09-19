SUMMARY = "A multitouch gesture recogniser for GNU/Linux"
DESCRIPTION = "Touchegg is an app that runs in the background and transforms the \
gestures you make on your touchpad or touchscreen into visible \
actions in your desktop."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.0.17"

RPM_NAME = "touchegg-2.0.17-3.5.aarch64.rpm"
RPM_HASH = "554c926bf0c0b9c2a66bbe813a68a7d719bbcca4972de23273940ba436da617b066230a4fcacb7aba65df21b9a3e601504b0d5878818a706a9d0ce1d0bbee97d"

RPROVIDES:${PN} += "touchegg"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXrandr.so.2 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libinput.so.10 \
libm.so.6 \
libpugixml.so.1 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
