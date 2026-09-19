SUMMARY = "Non-ABI stable API for the Qt 6 Network library"
DESCRIPTION = "This package provides private headers of libQt6Network that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-network-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "53cda7133ee5c531fd767e42ac0b67fd5cd75aae294b41ed142753c1f56aa9c742c6cfdbb060e254c6a0b54bbb7388b9ce78a78ca8b7678f125d5cf35a100a61"

RPROVIDES:${PN} += "cmake-Qt6NetworkPrivate \
qt6-network-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6Network \
libopenssl-3-devel"

inherit rpm
