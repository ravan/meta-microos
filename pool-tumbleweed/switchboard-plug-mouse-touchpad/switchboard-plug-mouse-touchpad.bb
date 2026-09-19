SUMMARY = "Switchboard Mouse and Touchpad Plug"
DESCRIPTION = "This is a swtichboard plug for elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.0"

RPM_NAME = "switchboard-plug-mouse-touchpad-8.1.0-1.3.aarch64.rpm"
RPM_HASH = "c8c91adebb83bb710a05a41736d3a6ca806f7ff2805aab4c27f4b8dc2a96ce1e440022ddaf544f5f88576d0e7f293b5f8843cb00737249dcacfbf6e12c5dfe99"

RPROVIDES:${PN} += "libmouse-touchpad.so \
switchboard-plug-mouse-touchpad"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libswitchboard-3.so.0 \
libxml2.so.16 \
switchboard"

inherit rpm
