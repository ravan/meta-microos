SUMMARY = "Maliit Keyboard Layout Files"
DESCRIPTION = "Provides layouts that are not english QWERTY \
for Maliit Virtual Keyboard."
LICENSE = "BSD-3-Clause & LGPL-3.0-only & CC-BY-3.0"

PV = "2.3.1"

RPM_NAME = "maliit-keyboard-layouts-2.3.1-3.10.aarch64.rpm"
RPM_HASH = "bc968cb03e1e30da3a85ae38c797917e82be4b774d02f1a84da80f0a0ad4a916313fad281b3632926d695f30136e7ce519175324e47f5d40baf11047e4316381"

RPROVIDES:${PN} += "libarplugin.so \
libazplugin.so \
libbeplugin.so \
libbgplugin.so \
libbsplugin.so \
libcaplugin.so \
libcsplugin.so \
libdaplugin.so \
libdeplugin.so \
libelplugin.so \
liben@dvplugin.so \
libeoplugin.so \
libesplugin.so \
libfaplugin.so \
libfiplugin.so \
libfr-chplugin.so \
libfrplugin.so \
libgdplugin.so \
libheplugin.so \
libhrplugin.so \
libhuplugin.so \
libisplugin.so \
libitplugin.so \
libjaplugin.so \
libkoplugin.so \
libltplugin.so \
liblvplugin.so \
libmkplugin.so \
libnbplugin.so \
libnlplugin.so \
libplplugin.so \
libptplugin.so \
libroplugin.so \
libruplugin.so \
libslplugin.so \
libsrplugin.so \
libsvplugin.so \
libthplugin.so \
libtrplugin.so \
libukplugin.so \
libzh-hansplugin.so \
libzh-hantplugin.so \
maliit-keyboard-layouts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libanthy.so.0 \
libc.so.6 \
libchewing.so.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libhunspell-1.7.so.0 \
libpinyin.so.15 \
libpresage.so.1 \
libstdc++.so.6 \
maliit-keyboard \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2"

inherit rpm
