SUMMARY = "Development headers for kweathercore"
DESCRIPTION = "Required headers to build components based on kweathercore."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kweathercore-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "8af257a97278fc3db697489b18075e308336fcbe20a6e785083bd88976b7507f206bb3a037fa5cb47061828f5adf0722aad726d3901edefe3c9c0b25ffb70adb"

RPROVIDES:${PN} += "cmake-KWeatherCore \
kweathercore-devel"

RDEPENDS:${PN} += "libKWeatherCore6"

inherit rpm
