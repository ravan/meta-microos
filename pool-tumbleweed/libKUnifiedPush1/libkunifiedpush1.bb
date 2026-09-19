SUMMARY = "KUnifiedPush library"
DESCRIPTION = "KUnifiedPush provides push notifications for KDE applications. Push \
notifications are a mechanism to support applications that occasionally need to \
receive some kind of information from their server-side part, and where \
receiving in a timely manner matters."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKUnifiedPush1-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "93d7669900832bad76b18e485bae32a61fb308827974be40468937ac1c5821604600ef4dcebd6d4042f3a14ebac60d96577eb193a528c165e18a8aec39953966"

RPROVIDES:${PN} += "libKUnifiedPush.so.1 \
libKUnifiedPush1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libcrypto.so.3 \
libstdc++.so.6"

inherit rpm
