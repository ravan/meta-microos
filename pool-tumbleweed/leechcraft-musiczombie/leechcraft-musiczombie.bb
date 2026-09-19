SUMMARY = "LeechCraft LMP MusicBrainz.org client Module"
DESCRIPTION = "This package provides a MusicBrainz.org client plugin for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-musiczombie-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "3ae7df2541ec2b1377cfa752404e190856fc6aa899d73a8668a98e9d52f22ffc22f0610a76686fc043b7ef8573b33499572820c72ff5f7f1edce77ec370ea8b3"

RPROVIDES:${PN} += "leechcraft-musiczombie \
libleechcraft-musiczombie.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-lmp \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Xml.so.6 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libchromaprint.so.1 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libstdc++.so.6 \
libswresample.so.6"

inherit rpm
