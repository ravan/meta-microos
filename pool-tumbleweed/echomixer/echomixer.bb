SUMMARY = "Echoaudio console application"
DESCRIPTION = "This is Linux-equivalent of the Echoaudio console application."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.5"

RPM_NAME = "echomixer-1.0.5-29.4.aarch64.rpm"
RPM_HASH = "59196c11785944693634689082037b51e01c4932fe466f419b84775d252929c6af298368083411f4ad25d9d02107cd91d877ee27bff4d41c0299de32e1d81cdc"

RPROVIDES:${PN} += "alsa-tools-gui-/usr/bin/echomixer \
echomixer"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
