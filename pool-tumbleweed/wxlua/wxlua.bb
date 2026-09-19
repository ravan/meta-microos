SUMMARY = "Lua bindings for wxWidgets"
DESCRIPTION = "Lua bindings for wxWidgets cross-patform GUI toolkit; \
supports Lua 5.1, 5.2, 5.3, 5.4, LuaJIT and wxWidgets 3.x"
LICENSE = "GPL-2.0-or-later-with-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "wxlua-3.1.0.0+42-3.4.aarch64.rpm"
RPM_HASH = "1831e4135b99c25f8335cf9366d0a689d3a011f4ad17a7d7697f9373b4cb27f202b88ecbb4e123531e9aac263d14b1bf4469df328ca31ca6cc4831e85af4f7b4"

RPROVIDES:${PN} += "wxlua"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0 \
libwxlua-bind-wx32gtk3u-3.1.0.0.so \
libwxlua-debugger-wx32gtk3u-3.1.0.0.so \
libwxlua-wx32gtk3u-3.1.0.0.so"

inherit rpm
