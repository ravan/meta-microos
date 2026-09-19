SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5SonnetCore5-5.116.0-3.2.aarch64.rpm"
RPM_HASH = "f0d2ec44ccc37e10e7de1a062534465ea64e40a11d0ef9b0dada8d7a5b2d6336bbdde609c1c9527593cb7c7e353cfbf329edfd034fc44d2a217a01bc654ecbf1"

RPROVIDES:${PN} += "libKF5SonnetCore.so.5 \
libKF5SonnetCore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6 \
sonnet"

inherit rpm
