SUMMARY = "Converting physical units: Build Environment"
DESCRIPTION = "KUnitConversion provides functions to convert values in different physical \
units. It supports converting different prefixes (e.g. kilo, mega, giga) as \
well as converting between different unit systems (e.g. liters, gallons). \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kunitconversion-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "6a9feae68d16d221f8a45de322c8c8de3a958cf610b58a1ecc5a7bcf8ca253d0e85a6a098a80f8f152d22c5a30e5a87deceb838263a722853f58375665aba73e"

RPROVIDES:${PN} += "cmake-KF5UnitConversion \
kunitconversion-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
libKF5UnitConversion5"

inherit rpm
