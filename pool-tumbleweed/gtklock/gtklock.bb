SUMMARY = "GTK-based lockscreen for Wayland"
DESCRIPTION = "gtklock is a lockscreen based on gtkgreet. \
It uses the wlr-layer-shell and wlr-input-inhibitor Wayland protocols. \
Works on sway and other wlroots-based compositors."
LICENSE = "GPL-3.0-only"

PV = "4.0.0"

RPM_NAME = "gtklock-4.0.0-1.9.aarch64.rpm"
RPM_HASH = "9d89748ec09a635b8f18995770372219e9b3abe4c7231fe8c44b81238257dff9e16472f85ac257a4183cc902d2777cac6c0e50a1291b5deaa9d6bb383de10db7"

RPROVIDES:${PN} += "gtklock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-session-lock.so.0 \
libpam.so.0"

inherit rpm
