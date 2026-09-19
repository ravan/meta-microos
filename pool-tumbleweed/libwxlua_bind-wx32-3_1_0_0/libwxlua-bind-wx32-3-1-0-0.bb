SUMMARY = "Lua bindings to the C++ wxWidgets cross-platform GUI library"
DESCRIPTION = "wxLua is a set of bindings to the C++ wxWidgets cross-platform GUI library for \
the Lua programming language. Nearly all of the functionality of wxWidgets is \
exposed to Lua, meaning that your programs can have windows, dialogs, menus, \
toolbars, controls, image loading and saving, drawing, sockets, streams, \
printing, clipboard access... and much more."
LICENSE = "GPL-2.0-or-later-with-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "libwxlua_bind-wx32-3_1_0_0-3.1.0.0+42-3.4.aarch64.rpm"
RPM_HASH = "edfe71d87021d18ee5fd6227294f6f621d499d8c7ae98aa9d6cb1b81e251c63c6414ab30b97273939d591927aa91f6c170e501d82d908d11821ffd684125cae3"

RPROVIDES:${PN} += "libwxlua-bind-wx32-3-1-0-0 \
libwxlua-bind-wx32gtk3u-3.1.0.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.16.0.0 \
libwx-baseu-suse.so.16.0.0 \
libwx-baseu-xml-suse.so.16.0.0 \
libwx-gtk3u-aui-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwx-gtk3u-gl-suse.so.16.0.0 \
libwx-gtk3u-html-suse.so.16.0.0 \
libwx-gtk3u-media-suse.so.16.0.0 \
libwx-gtk3u-stc-suse.so.16.0.0 \
libwx-gtk3u-webview-suse.so.16.0.0 \
libwx-gtk3u-xrc-suse.so.16.0.0 \
libwxlua-wx32gtk3u-3.1.0.0.so"

inherit rpm
