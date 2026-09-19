SUMMARY = "XFCE keyboard library for xfwm"
DESCRIPTION = "The libxfce4kbd-private library provides helper functions for xfwm4."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.2"

RPM_NAME = "libxfce4kbd-private-3-0-4.20.2-1.5.aarch64.rpm"
RPM_HASH = "215e813c8039afc13ad562f52942c78a0f704043d5e953c49af7cd2808ed6350c7553a8f898f5d4208084bea9aa7e548ac8a6a6fe63db6cc0d598a908b4fce1e"

RPROVIDES:${PN} += "libxfce4kbd-private-3-0 \
libxfce4kbd-private-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3"

inherit rpm
