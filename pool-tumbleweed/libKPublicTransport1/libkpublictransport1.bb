SUMMARY = "Library for querying public transport data"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
ransport journey queries."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libKPublicTransport1-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "1cf8156348252543c4dd8f0353b89965fc68d80ae8790203de5a9b20a47fab4aa362e926481f143b9ee7d484cca02bdd6da7ac93fa76b686796ed47263bbd0bf"

RPROVIDES:${PN} += "libKPublicTransport.so.1 \
libKPublicTransport1"

RDEPENDS:${PN} += "/sbin/ldconfig \
kpublictransport \
ld-linux-aarch64.so.1 \
libKF6I18n.so.6 \
libKF6I18nLocaleData.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
