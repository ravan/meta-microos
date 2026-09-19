SUMMARY = "A different take on the music player"
DESCRIPTION = "Musique is a music player designed by and for people that love \
music. Musique does its best to stay out the way and keep you \
focused on the only thing that really matters: Music. \
You need to try it to really get it. \
To set expectations right — Musique is not about podcasts or \
internet radio; it's not about managing mobile devices and it has \
no integrated music store. \
It's about listening to beautiful music."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "1.12"

RPM_NAME = "musique-1.12-3.4.aarch64.rpm"
RPM_HASH = "0ceb1f511c34d9e968424417c3b56ee4515e8793d93cd7ee72b4fd33084e7a383422b47d20d697a25221d3ef7b4c5198c6cadfa7114f58537a0a0160d5fe4cc0"

RPROVIDES:${PN} += "musique"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libmpv.so.2 \
libstdc++.so.6 \
libtag.so.2 \
qt6-sql-sqlite"

inherit rpm
