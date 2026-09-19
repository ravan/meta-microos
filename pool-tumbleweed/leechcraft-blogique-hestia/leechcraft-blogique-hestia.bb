SUMMARY = "LeechCraft Blogique 'Local blogging' Module"
DESCRIPTION = "This package provides a local blogging subplugin for LeechCraft Blogique."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-blogique-hestia-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "34e393ec21065516189dc966abcfa71cf235de97215d96c1e4e74d26ccbd66bdc590a9e1d5675e52980a8ed5a0ad3664a35ad4b1f2af8aa54426451f2b098bbe"

RPROVIDES:${PN} += "leechcraft-blogique-hestia \
leechcraft-blogique-subplugin \
libleechcraft-blogique-hestia.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-blogique \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
