SUMMARY = "Development package for the libmm-qt library"
DESCRIPTION = "Qt wrapper for ModemManager DBus API. Development files."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-modemmanager-qt-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "37aff6134752a5adc78d1712a7187938b19d3b2ab1a423bfc7a0a2dafc9f228cc8d28337926edcc26b68597af2cbd8a7b191689f9030065bb0354e701f55200d"

RPROVIDES:${PN} += "cmake-KF6ModemManagerQt \
kf6-modemmanager-qt-devel"

RDEPENDS:${PN} += "libKF6ModemManagerQt6 \
pkgconfig-ModemManager"

inherit rpm
