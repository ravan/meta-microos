SUMMARY = "Plugins to add python scripting to texworks"
DESCRIPTION = "The TeXworks project is a simple TeX front-end program (working \
environment) that is modeled on Dick Koch's TeXShop for Mac OS X. \
 \
This package adds lua scripting abitilies to TeXworks."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.11"

RPM_NAME = "texworks-plugin-lua-0.6.11-1.3.aarch64.rpm"
RPM_HASH = "fe0afeb19bb211d3a54b13ef667ef56de2a3aa474dedc6497ddfee88fde906002404e9b9b04532b1ef44dfa6a68f13b1c69dde79c858945c6c7f910e5c0e79b5"

RPROVIDES:${PN} += "libTWLuaPlugin.so \
texworks-plugin-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libstdc++.so.6 \
lua \
texworks"

inherit rpm
