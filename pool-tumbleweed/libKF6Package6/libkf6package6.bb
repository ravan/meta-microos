SUMMARY = "Non-binary asset user-installable package managing framework"
DESCRIPTION = "This framework lets applications to manage user installable packages of \
non-binary assets."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Package6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "41351c85a3430c1ac44ed2f8dcc998eb50938f1be91735b33a455ed89bd2e15f3aea8bdedd273f9fa9f6e8f0ab4334c72c571fa499c798d9e84ec464a0ae8cdf"

RPROVIDES:${PN} += "libKF6Package.so.6 \
libKF6Package6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kpackage \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
