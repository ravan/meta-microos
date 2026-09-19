SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "sonnet-5.116.0-3.2.aarch64.rpm"
RPM_HASH = "88df3d265a963c4f058b776fe6bdc1896b73642ee450740dd654e698da3513c900f4477afd59f4daaa0a1069c63d721027bde20ba4743871b035a850eb36793a"

RPROVIDES:${PN} += "sonnet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5SonnetCore.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
