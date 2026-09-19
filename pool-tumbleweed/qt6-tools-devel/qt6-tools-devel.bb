SUMMARY = "Qt 6 Tools libraries - Development files"
DESCRIPTION = "Development files for the Qt6 tools libraries."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-tools-devel-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "aa728e319198e9881aad2b6cbdfde27c488636d09885de2defbb294967e4d025abe0267ace37ffae895a01bdd1e8c914af4e0be4ab94b8f0fa9747c169fa85d8"

RPROVIDES:${PN} += "cmake-Qt6Tools \
cmake-Qt6ToolsTools \
qt6-tools-devel"

RDEPENDS:${PN} += "qt6-tools \
qt6-tools-helpgenerators \
qt6-tools-qdoc"

inherit rpm
