SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6SonnetCore6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "95992383ad5acd6b24e2eb35f7dad53a91e24d413f9ff045717beedfd94214894cd3f77656f74b166622dffbf99b8fbe1a48bccdd18fcc9c4092f8eaf423d668"

RPROVIDES:${PN} += "libKF6SonnetCore.so.6 \
libKF6SonnetCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-sonnet \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
