SUMMARY = "Converting physical units: Build Environment"
DESCRIPTION = "KUnitConversion provides functions to convert values in different physical \
units. It supports converting different prefixes (e.g. kilo, mega, giga) as \
well as converting between different unit systems (e.g. liters, gallons). \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kunitconversion-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "7c61263cc38bb7dbd6f7d166d230b40e25f5d90d63664b56ce96200c1218e9ad7f3f2b10472d5006db1d9b3864701b98ff3906ac159b29de72f21ede7c641e4a"

RPROVIDES:${PN} += "cmake-KF6UnitConversion \
kf6-kunitconversion-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
libKF6UnitConversion6"

inherit rpm
