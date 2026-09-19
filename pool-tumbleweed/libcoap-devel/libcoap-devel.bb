SUMMARY = "Development files for libcoap"
DESCRIPTION = "libcoap implements a lightweight application protocol for devices that are \
constrained their resources such as computing power, RF range, memory, \
bandwith, or network packet sizes. \
 \
This package contains files required for building with libcoap."
LICENSE = "BSD-2-Clause"

PV = "4.3.5b"

RPM_NAME = "libcoap-devel-4.3.5b-1.4.aarch64.rpm"
RPM_HASH = "5b1d236051f4d0d89bd384f736986f9b022be921479c7f4a97b154c282f8e5c0c184ca014b2c48efb3d17f75687a4a9b5e1dbd944a3188cb8b46ef5528dcf8fe"

RPROVIDES:${PN} += "libcoap-devel \
pkgconfig-libcoap-3 \
pkgconfig-libcoap-3-openssl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcoap3-3"

inherit rpm
