SUMMARY = "Non-ABI stable API for the Qt 6 Pdf library"
DESCRIPTION = "This package provides private headers of libQt6Pdf that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-pdf-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "3be06c12a152936d6b39ad5948be18f733107ff3bf9e49811ffa08fe37533f16e35787a3909f9538cb0cd71ac3968f7fa7edb9d1d72b25d995e4798ddb881410"

RPROVIDES:${PN} += "cmake-Qt6PdfPrivate \
qt6-pdf-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Pdf"

inherit rpm
