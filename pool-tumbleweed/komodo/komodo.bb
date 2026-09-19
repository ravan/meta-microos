SUMMARY = "Todo manager that uses todo.txt specification"
DESCRIPTION = "KomoDo is a todo manager that uses todo.txt specification. It parses any \
compliant todo.txt files and turns them into easy to use list of tasks. \
KomoDo has built-in help for the todo.txt specification. \
 \
Features \
- Open and create new todo.txt files \
- Add, delete and edit tasks \
- Filter and search tasks"
LICENSE = "GPL-2.0-or-later"

PV = "1.5.0"

RPM_NAME = "komodo-1.5.0-1.9.aarch64.rpm"
RPM_HASH = "91824d23ef6c49cfa487f966be61791bc1935cdf25852ce9169ca22de3538103a610d3126ae2f107d73d19153458e1cc77cb0e9fe6d78b57f47d44fbcaca7a31"

RPROVIDES:${PN} += "komodo"

RDEPENDS:${PN} += "kf6-kconfig-imports \
kf6-kcoreaddons-imports \
kf6-kirigami-imports \
kf6-kitemmodels-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6IconThemes.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
