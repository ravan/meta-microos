SUMMARY = "Non-ABI stable API for the Qt 6 PdfQuick library"
DESCRIPTION = "This package provides private headers of libQt6PdfQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-pdfquick-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "84ed98bb071a00ce117d044a65ebc922698d3708e9797e8c8b105dbed22ec0e3b3a1dc24f1fa8866e85673152d9935e983667cb9908eb78dc9b10a81101b895b"

RPROVIDES:${PN} += "cmake-Qt6PdfQuickPrivate \
qt6-pdfquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PdfQuick"

inherit rpm
