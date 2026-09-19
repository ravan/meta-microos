SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-sonnet-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "f67fded76931cc6bf316d3e3089ee5f9af9896c103f11539a129fb181ed6052b64c85535d3406d9692929e7ebd7114da6925977bd1516998c6858b6be9047238"

RPROVIDES:${PN} += "kf6-sonnet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6SonnetCore.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
