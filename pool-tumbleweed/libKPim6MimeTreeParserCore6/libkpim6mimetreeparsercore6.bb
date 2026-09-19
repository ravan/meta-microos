SUMMARY = "Core library to parse MIME trees"
DESCRIPTION = "mimetreeparser is a parser for MIME trees. Given a MIME tree, it extracts \
the parts (text, html...) and attachments. This package provides \
the core library needed for parsing."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6MimeTreeParserCore6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "91a7f28a07c6b611da5b6fdae0fbdcdff6ab57114fc15c0d6c726115961f064da767db3f44e6fcb6e2a62db54ce4449e83e99fd18cbbae050b2092b64ecbe1aa"

RPROVIDES:${PN} += "libKPim6MimeTreeParserCore.so.6 \
libKPim6MimeTreeParserCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6I18n.so.6 \
libKF6Mime.so.6 \
libKPim6Libkleo.so.6 \
libKPim6Mbox.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgpgmepp.so.7 \
libqgpgmeqt6.so.15 \
libstdc++.so.6 \
mimetreeparser"

inherit rpm
