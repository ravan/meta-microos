SUMMARY = "Development files for QR code generator"
DESCRIPTION = "Development files, headers/libs for QR code generator"
LICENSE = "MIT"

PV = "1.8.0+git17.856ba8a"

RPM_NAME = "QR-Code-generator-devel-1.8.0+git17.856ba8a-3.6.aarch64.rpm"
RPM_HASH = "10c324e062126686ed41c54d2bef7c8f29e6760e264c42785f4379931efdfd2eaca5337f8f5b4d94482084e50735305fa2e13e5f2de572c6600d437fc4565962"

RPROVIDES:${PN} += "QR-Code-generator-devel \
cmake-qrcodegen \
cmake-qrcodegencpp \
pkgconfig-qrcodegen \
pkgconfig-qrcodegencpp \
qrcodegen-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqrcodegen1 \
libqrcodegencpp1"

inherit rpm
