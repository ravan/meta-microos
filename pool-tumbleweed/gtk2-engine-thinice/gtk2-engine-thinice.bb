SUMMARY = "ThinIce GTK+ 2 Theme Engine"
DESCRIPTION = "The ThinIce engine features thin edges and Icy Colors, and provides a \
simple mostly clean appearance many find satisfying."
LICENSE = "LGPL-2.1-or-later"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-thinice-2.20.2-23.6.aarch64.rpm"
RPM_HASH = "6abde532a2a50c696ff3a07d7e2a79406626c9e37fb106cbb07fb238248a12284f6b46922559cd1e0a44f34c292fea2c6f18d53c2e973cc9293fea475c2aef9f"

RPROVIDES:${PN} += "gtk2-engine-thinice \
libthinice.so"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
