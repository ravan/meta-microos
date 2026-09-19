SUMMARY = "Non-ABI stable API for the Qt 6 KMSSupport library"
DESCRIPTION = "This package provides private headers of libQt6KmsSupport that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-kmssupport-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "9b629d6f8891a7665b6b7361d8871016815188dc4299220b826164ff45b0a56102255de8a4c89179fe6be3ca289f53f80829b1b8a455ef9a293115ea78f85c86"

RPROVIDES:${PN} += "qt6-kmssupport-private-devel"

RDEPENDS:${PN} += "qt6-kmssupport-devel-static"

inherit rpm
