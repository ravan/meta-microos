SUMMARY = "Torrent Downloading Library"
DESCRIPTION = "libktorrent is a torrent downloading library."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKTorrent6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "1709c7d5c660e7d8754342fb42648dcac96f0bb63c7ed7c870a7c240b1a4e52ec67a4520e1916800d888cf23182af7391871fb0500b3cd9898e040e928b0d0fa"

RPROVIDES:${PN} += "libKTorrent6 \
libKTorrent6.so.6 \
libktorrent \
libktorrent-lang"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libgmp.so.10 \
libstdc++.so.6"

inherit rpm
