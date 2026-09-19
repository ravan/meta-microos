SUMMARY = "Lua bindings to the C++ wxWidgets cross-platform GUI library"
DESCRIPTION = "wxLua is a set of bindings to the C++ wxWidgets cross-platform GUI library for \
the Lua programming language. Nearly all of the functionality of wxWidgets is \
exposed to Lua, meaning that your programs can have windows, dialogs, menus, \
toolbars, controls, image loading and saving, drawing, sockets, streams, \
printing, clipboard access... and much more."
LICENSE = "GPL-2.0-or-later-with-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "libwxlua_debug-wx32-3_1_0_0-3.1.0.0+42-3.4.aarch64.rpm"
RPM_HASH = "48a31cd9a1b8af09b57f89a93e7dd92fe26d1aa82241cd6f15ba4a3dd4387b073bdd1b9edd892b185fb55174f680adc873adf6ea3e82fc5e501fb56907a21ee4"

RPROVIDES:${PN} += "libwxlua-debug-wx32-3-1-0-0 \
libwxlua-debug-wx32gtk3u-3.1.0.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwxlua-wx32gtk3u-3.1.0.0.so"

inherit rpm
