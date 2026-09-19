SUMMARY = "Widgets for library to parse MIME trees"
DESCRIPTION = "mimetreeparser is a parser for MIME trees. Given a MIME tree, it extracts \
the parts (text, html...) and attachments. This package provides graphical \
widgets for the parser."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6MimeTreeParserWidgets6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "83757ebe69d36cd6b0e373cb6a7f7bbd904459ac4b77c404317a0b267bffded71aafaa2d9e1bcc8b42b21b5f2553fcb479a2c66ccc5f2549065a03cd1aeea628"

RPROVIDES:${PN} += "libKPim6MimeTreeParserWidgets.so.6 \
libKPim6MimeTreeParserWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6ColorScheme.so.6 \
libKF6I18n.so.6 \
libKF6Mime.so.6 \
libKF6WidgetsAddons.so.6 \
libKPim6Libkleo.so.6 \
libKPim6MimeTreeParserCore.so.6 \
libKPim6MimeTreeParserCore6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
