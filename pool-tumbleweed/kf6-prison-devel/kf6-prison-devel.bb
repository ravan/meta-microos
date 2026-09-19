SUMMARY = "Development files Prison, a barcode abstraction library"
DESCRIPTION = "Development files for prison, a barcode abstraction layer library providing \
uniform access to generation of barcodes with data."
LICENSE = "MIT"

PV = "6.30.0"

RPM_NAME = "kf6-prison-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "2edca3e4dcee99eb9cbe9dff9884ad8f9c73908ca6891912e7f08e325ec6586b19a93dce329e52588507deb0212012f61f8c4412a0fac4751995853ae5dd1b56"

RPROVIDES:${PN} += "cmake-KF6Prison \
kf6-prison-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
libKF6Prison6"

inherit rpm
