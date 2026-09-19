SUMMARY = "Async Bluez wrapper library"
DESCRIPTION = "Async Bluez wrapper library."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-bluez-qt-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "e31e22b9efaa6c0007c7824b2f4e69258d93b88e3097ea93e256fa551dc4cab9cf7ede61171f84af5b4c39347586a7612eb7f5cab0adbc31503f2686120267f2"

RPROVIDES:${PN} += "kf6-bluez-qt"

RDEPENDS:${PN} += ""

inherit rpm
