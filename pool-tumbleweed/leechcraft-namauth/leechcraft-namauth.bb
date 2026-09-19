SUMMARY = "LeechCraft HTTP authentication Module"
DESCRIPTION = "This package provides providing standard HTTP authentication facilities for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-namauth-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "bf5c719a02ff39c2de0d2abda09ff7868d22dd3bf7be913cc8b5f77749227ab5a15ae917ba47dc6f715fe2e0491cbe2d361bf7a773a13ca5d2159d073df733ff"

RPROVIDES:${PN} += "leechcraft-namauth \
libleechcraft-namauth.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
