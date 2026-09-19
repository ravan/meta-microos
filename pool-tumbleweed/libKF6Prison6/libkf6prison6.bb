SUMMARY = "Barcode abstraction layer library"
DESCRIPTION = "Prison is a barcode abstraction layer library providing \
uniform access to generation of barcodes with data."
LICENSE = "MIT"

PV = "6.30.0"

RPM_NAME = "libKF6Prison6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "6eab0ca3364b25df611fd6d7ebe9b073c1a1aae91341320699425aa07940f40aeb56a3f2c17e78c857bb9bee85b9f96e5746105f7bf592fc1128dc22ee000bc3"

RPROVIDES:${PN} += "libKF6Prison.so.6 \
libKF6Prison6 \
libKF6PrisonScanner.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-prison \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libZXing.so.4 \
libc.so.6 \
libdmtx.so.0 \
libgcc-s.so.1 \
libqrencode.so.4 \
libstdc++.so.6"

inherit rpm
