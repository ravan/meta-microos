SUMMARY = "Non-ABI stable API for the Qt 6 Test library"
DESCRIPTION = "This package provides private headers of libQt6Test that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-test-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "1a64657d9603c5edc2d061036ebb8cb6cf0e24dc786d566bc343e6b1cd971ab55d67fec9985f702b57ca6886a2899816b29b3ff37c4485e406a84499adc5f549"

RPROVIDES:${PN} += "cmake-Qt6TestPrivate \
qt6-test-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6Test"

inherit rpm
