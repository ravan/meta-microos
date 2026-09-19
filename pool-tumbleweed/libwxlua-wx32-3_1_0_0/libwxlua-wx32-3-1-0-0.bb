SUMMARY = "Lua bindings to the C++ wxWidgets cross-platform GUI library"
DESCRIPTION = "wxLua is a set of bindings to the C++ wxWidgets cross-platform GUI library for \
the Lua programming language. Nearly all of the functionality of wxWidgets is \
exposed to Lua, meaning that your programs can have windows, dialogs, menus, \
toolbars, controls, image loading and saving, drawing, sockets, streams, \
printing, clipboard access... and much more."
LICENSE = "GPL-2.0-or-later-with-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "libwxlua-wx32-3_1_0_0-3.1.0.0+42-3.4.aarch64.rpm"
RPM_HASH = "43fb7507816ace1dc69defb38888c5992288bf6ac9e037305bffdba86976f7b7bc2d846c8aa41d1f81dcf11027f0c3733439a80117afe116037134cbab6bc391"

RPROVIDES:${PN} += "libwxlua-wx32-3-1-0-0 \
libwxlua-wx32gtk3u-3.1.0.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0"

inherit rpm
