SUMMARY = "Korean IME"
DESCRIPTION = "Kime is a fast Korean Input Method Engine for Linux. \
Supports GTK3/4, Qt5/6, XIM and Wayland."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.1"

RPM_NAME = "kime-3.1.1-2.12.aarch64.rpm"
RPM_HASH = "4ed7f586be422c273ce46535da326886d978bae14c08ec11fdf631f725c2e979735809cacd21424f8ca9b3133ccd2a3c0bef6c68e6845337625cc50775363c89"

RPROVIDES:${PN} += "config-kime \
kime \
libkime-engine.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
libc.so.6 \
libdbus-1.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
