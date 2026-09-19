SUMMARY = "Lua bindings to the C++ wxWidgets cross-platform GUI library"
DESCRIPTION = "wxLua is a set of bindings to the C++ wxWidgets cross-platform GUI library for \
the Lua programming language. Nearly all of the functionality of wxWidgets is \
exposed to Lua, meaning that your programs can have windows, dialogs, menus, \
toolbars, controls, image loading and saving, drawing, sockets, streams, \
printing, clipboard access... and much more."
LICENSE = "GPL-2.0-or-later-with-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "libwxlua_debugger-wx32-3_1_0_0-3.1.0.0+42-3.4.aarch64.rpm"
RPM_HASH = "671d30cf2570e6fa8dadc996f472952110f266fa7968bf8c182d965441effdc26b29a970ab2f741b25dd7b9f9637d61f20b27bc0a75b1c5a7a9fbf9004abcf04"

RPROVIDES:${PN} += "libwxlua-debugger-wx32-3-1-0-0 \
libwxlua-debugger-wx32gtk3u-3.1.0.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.16.0.0 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwxlua-bind-wx32gtk3u-3.1.0.0.so \
libwxlua-debug-wx32gtk3u-3.1.0.0.so \
libwxlua-wx32gtk3u-3.1.0.0.so"

inherit rpm
