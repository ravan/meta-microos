SUMMARY = "Tool for converting physical units"
DESCRIPTION = "KUnitConversion provides functions to convert values in different physical \
units. It supports converting different prefixes (e.g. kilo, mega, giga) as \
well as converting between different unit systems (e.g. liters, gallons)."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kunitconversion-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "37bcc5e56dac4994d19e3ea74284187566c236b84149976b4bf0a79896b81df9ca5d2669b75a09aebe364c696f25deb373670d519b8bea429ceb9d293a1412b7"

RPROVIDES:${PN} += "kf6-kunitconversion"

RDEPENDS:${PN} += ""

inherit rpm
