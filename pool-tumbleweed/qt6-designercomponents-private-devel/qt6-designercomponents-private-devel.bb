SUMMARY = "Development files for the Qt 6 DesignerComponents library"
DESCRIPTION = "Development files for the Qt 6 DesignerComponents library. \
This library does not have any ABI or API guarantees."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-designercomponents-private-devel-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "783b9d8cd9b71b0d42bbcb82ca1a45ccf1a8b80add55f8f35d9a724ae6f5d00942ec202c863a65d478cd059b5f89a8fa177066343cbcb524fefa35f87d507226"

RPROVIDES:${PN} += "cmake-Qt6DesignerComponentsPrivate \
qt6-designercomponents-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6DesignerPrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6WidgetsPrivate \
cmake-Qt6Xml \
libQt6DesignerComponents6"

inherit rpm
