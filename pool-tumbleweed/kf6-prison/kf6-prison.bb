SUMMARY = "Barcode abstraction layer library"
DESCRIPTION = "Prison is a barcode abstraction layer library providing \
uniform access to generation of barcodes with data."
LICENSE = "MIT"

PV = "6.30.0"

RPM_NAME = "kf6-prison-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "921d2a7d37cf5701cf0ce4e678934e575d6822605c6d37d75d1ac9773fcb4674ad6d6b63e64d8b3ecfc3f1f5156c1a147bac31a80b3d30ae7d6b21d56b576476"

RPROVIDES:${PN} += "kf6-prison"

RDEPENDS:${PN} += ""

inherit rpm
