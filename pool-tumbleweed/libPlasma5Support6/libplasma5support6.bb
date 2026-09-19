SUMMARY = "plasma5support library"
DESCRIPTION = "The plasma5support library."
LICENSE = "LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libPlasma5Support6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "01a61b0ff97628912cef2ed0018aa19a45dd4d62b1e2fe18fdd42b41cc3ccd3183f6d4e1856c4517d6331780edce2c7d1533dbb7e413d19791f170b96e9706e6"

RPROVIDES:${PN} += "libPlasma5Support.so.6 \
libPlasma5Support6 \
libplasma-geolocation-interface.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6Sql.so.6 \
libc.so.6 \
libstdc++.so.6 \
plasma5support6 \
qt6-sql-sqlite"

inherit rpm
