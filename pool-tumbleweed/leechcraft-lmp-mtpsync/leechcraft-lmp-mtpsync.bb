SUMMARY = "LeechCraft MtpSync Module"
DESCRIPTION = "This package allows to synchronize with MTP devices via LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-lmp-mtpsync-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "26e073e6bf05eba0e16ae5b1aff495675305bdbad74d2a78f8712136e4df469b1df820249f9d20778f9bef6d516f7ab65ce1da66f284bc77722e208eeb88efcd"

RPROVIDES:${PN} += "leechcraft-lmp-mtpsync \
libleechcraft-lmp-mtpsync.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-devmon \
leechcraft-lmp \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libmtp.so.9 \
libstdc++.so.6 \
libtag.so.2"

inherit rpm
