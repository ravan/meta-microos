SUMMARY = "Non-ABI stable API for the Qt 6 PrintSupport library"
DESCRIPTION = "This package provides private headers of libQt6PrintSupport that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-printsupport-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "667b3f40110d634f8496433edfa237d9a2755fa6ab82b067aa607da49269841350e3659b1e079af940f3dfe26fb20949c94857494c2edbc610faab99401819a9"

RPROVIDES:${PN} += "cmake-Qt6PrintSupportPrivate \
qt6-printsupport-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6PrintSupport \
cmake-Qt6WidgetsPrivate"

inherit rpm
