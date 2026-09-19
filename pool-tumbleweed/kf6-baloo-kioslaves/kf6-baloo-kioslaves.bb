SUMMARY = "KIO slave components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains KIO slave components."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-baloo-kioslaves-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "d212a170ad4f8b23650ebc712b84c088fa7d634e2fe93b787b49526cb69b0c5c02d5203df66cd868267c9119d73ec9035741e3c8b5ace510189d14eb4cd56a5c"

RPROVIDES:${PN} += "kf6-baloo-kioslaves"

RDEPENDS:${PN} += "kf6-kded \
ld-linux-aarch64.so.1 \
libKF6Baloo.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6FileMetaData.so.3 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
