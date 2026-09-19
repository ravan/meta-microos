SUMMARY = "Non-ABI stable API for the Qt 6 Designer libraries"
DESCRIPTION = "This package provides private headers of libQt6Designer that do not have any \
ABI or API guarantees."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-designer-private-devel-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "43decbbd5572bbb73a1716fcd1c97915ceb1940f4a3173082902be7cc74235b4032f54840a15f711eef5d85e064e227ac4f8734447971119ef774a7fcc140412"

RPROVIDES:${PN} += "cmake-Qt6DesignerPrivate \
qt6-designer-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6Designer \
cmake-Qt6GuiPrivate \
cmake-Qt6WidgetsPrivate"

inherit rpm
