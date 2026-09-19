SUMMARY = "MATE Desktop sensors applet shared libraries"
DESCRIPTION = "MATE Sensors Applet is an applet for the MATE Panel to display \
readings from hardware sensors, including CPU temperature, fan \
speeds and voltage readings under Linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "libmate-sensors-applet-plugin0-1.28.0-1.11.aarch64.rpm"
RPM_HASH = "a9d620e1c2104a65e2adbeb46bd602c6d9e7e92260b4317b46d6d0dd528ca4222a48652368da3b8032701d9e40089df4d239884a412339692907d1a60ecf34c5"

RPROVIDES:${PN} += "libmate-sensors-applet-plugin.so.0 \
libmate-sensors-applet-plugin0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
