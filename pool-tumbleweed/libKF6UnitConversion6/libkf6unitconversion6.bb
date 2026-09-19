SUMMARY = "Converting physical units"
DESCRIPTION = "KUnitConversion provides functions to convert values in different physical \
units. It supports converting different prefixes (e.g. kilo, mega, giga) as \
well as converting between different unit systems (e.g. liters, gallons)."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6UnitConversion6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "5e783c4f03135bf92627d936a8716db9db6643eb471c676a487df62d87653e660e8c494b56fecd7f732a4fdf770a4de3c27ab150cc2dc0a1fa6f1d23c30d4000"

RPROVIDES:${PN} += "libKF6UnitConversion.so.6 \
libKF6UnitConversion6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kunitconversion \
ld-linux-aarch64.so.1 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
