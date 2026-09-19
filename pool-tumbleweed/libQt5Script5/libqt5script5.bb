SUMMARY = "Qt 5 Script library"
DESCRIPTION = "Qt Script is a module for adding scripting to applications. It allows \
evaluating and debugging of scripts, and advanced use of objects and \
functions. It also gives access to a low-level ECMAScript engine API."
LICENSE = "(LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later) & LGPL-2.0-or-later & LGPL-2.1-only"

PV = "5.15.19"

RPM_NAME = "libQt5Script5-5.15.19-1.3.aarch64.rpm"
RPM_HASH = "ed39af37c221b8b00c6838da6a1f3167358efd193c0e57d6111185635f7794ab02408128258e53cc324c21be6c7b190f2555e9c4610a5e4151ea7edaee0266e1"

RPROVIDES:${PN} += "libQt5Script.so.5 \
libQt5Script5 \
libQt5ScriptTools.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
