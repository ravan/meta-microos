SUMMARY = "Library to assist working with IMAP servers"
DESCRIPTION = "This package provides the core library to interface and communicate with \
IMAP mail servers."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6IMAP6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "f22eddf108684a21adef5cb978068280bda7ebb2cc632fa993d559dfa70cef5e799345b5f941cb5c9b6c0e232c925f00934f0054530899f273d8a83b9315a179"

RPROVIDES:${PN} += "libKPim6IMAP.so.6 \
libKPim6IMAP6"

RDEPENDS:${PN} += "/sbin/ldconfig \
cyrus-sasl-crammd5 \
cyrus-sasl-digestmd5 \
cyrus-sasl-gssapi \
cyrus-sasl-plain \
kimap \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6Mime.so.6 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libsasl2.so.3 \
libstdc++.so.6 \
sasl2-kdexoauth2"

inherit rpm
