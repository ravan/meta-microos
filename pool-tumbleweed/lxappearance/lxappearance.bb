SUMMARY = "It's a desktop-independent theme switcher for GTK+"
DESCRIPTION = "LXAppearance is part of LXDE project. \
It's a desktop-independent theme switcher for GTK+."
LICENSE = "GPL-2.0-only"

PV = "0.6.3"

RPM_NAME = "lxappearance-0.6.3-1.30.aarch64.rpm"
RPM_HASH = "f2e42016e383cdad63cbb5c77aff54cf75752a7d167d53be571545476a064f3e678b5561802b01f8f0da7fe2abbbb811a408350cd2b170c62a731f3fd52347f1"

RPROVIDES:${PN} += "lxappearance"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libdbus-1.so.3 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
