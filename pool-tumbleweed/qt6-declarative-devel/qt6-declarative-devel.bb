SUMMARY = "Qt 6 Declarative meta package"
DESCRIPTION = "This meta-package requires all the qt6-declarative development packages."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-declarative-devel-6.11.2-2.1.noarch.rpm"
RPM_HASH = "7334fe0b1cee2bdeb7ddcfb225c3abda27373d40f42c2936083de2da17cdba9df6c75efaeb36d931e3f3312a8ef3ec34b08573015ad40d6b0fb688bbd63dee0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-declarative-devel"

RDEPENDS:${PN} += "cmake-Qt6Qml \
cmake-Qt6QmlCompiler \
cmake-Qt6Quick \
cmake-Qt6QuickControls2 \
cmake-Qt6QuickControls2Impl \
cmake-Qt6QuickDialogs2 \
cmake-Qt6QuickDialogs2QuickImpl \
cmake-Qt6QuickTest \
cmake-Qt6QuickWidgets"

inherit rpm
