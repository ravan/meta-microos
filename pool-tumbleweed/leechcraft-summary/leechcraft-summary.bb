SUMMARY = "LeechCraft Summary info Module"
DESCRIPTION = "This package provides a summary plugin for LeechCraft which shows a \
quick overview of LeechCraft's state. It shows current tasks like \
leeching or seeding torrents and downloading files with \
context-dependent actions and views. It also can collect status \
information from other plugins like unread channels. \
 \
Summary also allows to perform searches via the installed plugins \
like SeekThru or HistoryHolder. \
 \
Features: \
 * List of current tasks and events with context-dependent actions \
and views for selected items. \
 * Support for gathering status information from other plugins. \
 * Category-based search query support via other plugins."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-summary-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "7bac72c31c1da7666cc4d3960d9bd542dc5b597cb16e17579f4c1c5d5ef3ab8c1ad449e0c13c78ed648c5cab6ff718eadbab5ce4b77a7795531d8972668bbf10"

RPROVIDES:${PN} += "leechcraft-summary \
leechcraft-summaryrepresentation \
libleechcraft-summary.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-tags-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
