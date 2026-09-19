SUMMARY = "Qt 6 CoAP library - Development files"
DESCRIPTION = "Development files for the Qt 6 CoAP library."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-coap-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "ed67ca0bd2415b7add0511429a327f2c8cde0bc431072b0b0a76aa8daa9cd5474ede4040fd4daabcd40b9ffee4d31340e145c4dc3273e6ea847c81180d3acd69"

RPROVIDES:${PN} += "cmake-Qt6Coap \
pkgconfig-Qt6Coap \
qt6-coap-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
libQt6Coap6 \
pkgconfig-Qt6Core"

inherit rpm
