SUMMARY = "Converting physical units"
DESCRIPTION = "KUnitConversion provides functions to convert values in different physical \
units. It supports converting different prefixes (e.g. kilo, mega, giga) as \
well as converting between different unit systems (e.g. liters, gallons)."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5UnitConversion5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "ef45e8614cea065ac62a7dfa5ebbced432b0996ab979f2589be413a8ae1972d718cd6cb33f324f833fbf200aad0d973973cbab0b24ab8be657fc1dd24206b197"

RPROVIDES:${PN} += "libKF5UnitConversion.so.5 \
libKF5UnitConversion5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
