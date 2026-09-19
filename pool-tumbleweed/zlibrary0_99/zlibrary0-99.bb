SUMMARY = "Cross-platform GUI library"
DESCRIPTION = "ZLibrary is a cross-platform library to build applications running on \
desktop Linux, Windows, and different Linux-based PDAs."
LICENSE = "GPL-2.0-or-later"

PV = "0.99.4"

RPM_NAME = "zlibrary0_99-0.99.4-5.4.aarch64.rpm"
RPM_HASH = "e3627f1e9b7f392e0ad94f11114f454c08844db5a5dafcab9924ccbacc5b471f75c81915fcd6e98c56edd8122b89ce7f5c4e26cb11a3b57d002cc00ad06228e0"

RPROVIDES:${PN} += "libzlcore.so.0.99 \
libzltext.so.0.99 \
zlibrary0-99"

RDEPENDS:${PN} += "/sbin/ldconfig \
libbz2.so.1 \
libc.so.6 \
libexpat.so.1 \
libfribidi.so.0 \
libstdc++.so.6 \
libunibreak.so.6 \
libz.so.1 \
zlibrary-data \
zlibrary-ui"

inherit rpm
