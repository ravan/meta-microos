SUMMARY = "Switchboard Keyboard Plug"
DESCRIPTION = "Adjust keyboard settings from Switchboard. This plug can be used to change \
several keyboard settings, for example the delay and speed of the key \
repetition, or the cursor blinking speed. You can change your keyboard \
layout, and use multiple layouts at the same time. Keyboard shortcuts are \
also part of this plug."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.1"

RPM_NAME = "switchboard-plug-keyboard-8.1.1-1.3.aarch64.rpm"
RPM_HASH = "181da87848840405b8dbd9cfbf12edd9b1955eb807be1064957464e79f3e337095888dde271e089ccacbf3a2576972eaf834b94e74f5fc98de765ec7900fa1e3"

RPROVIDES:${PN} += "libkeyboard.so \
switchboard-plug-keyboard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libibus-1.0.so.5 \
libswitchboard-3.so.0 \
libxml2.so.16 \
switchboard"

inherit rpm
