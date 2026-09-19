SUMMARY = "Library for KDE Education Applications"
DESCRIPTION = "This package contains the library which is required by the KDE education \
applications."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKEduVocDocument5-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "8cfb47b9661a2dbcc89fc61e0bc238fcea7a0ef7cf180e52759f3aea3b09fd6dc6a5cc0db0f244843394ac4ce8c687898e8072f1c41f9fcbc687f000bdb30124"

RPROVIDES:${PN} += "libKEduVocDocument.so.5 \
libKEduVocDocument5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libQt6Core.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
