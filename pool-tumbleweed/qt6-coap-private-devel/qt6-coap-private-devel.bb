SUMMARY = "Non-ABI stable API for the Qt 6 CoAP library"
DESCRIPTION = "This package provides private headers of libQt6Coap that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-coap-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "a7cdcf90e89f7b0d853f1115ef4d5aac5acf53251a99ab0b8c1094d4785803fe211c70b291f163b4932113e3d918eea56b9846c0bf11e3d0a77f162864eed8ab"

RPROVIDES:${PN} += "cmake-Qt6CoapPrivate \
qt6-coap-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Coap \
cmake-Qt6Network"

inherit rpm
