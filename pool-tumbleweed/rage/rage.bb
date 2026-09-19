SUMMARY = "A mplayer like video and audio player with some extra bells and whistles"
DESCRIPTION = "Rage is a simple video and audio player intended to be slick yet simplistic, much like Mplayer. You can provide 1 or \
more files to play on the command-line or just DND files onto the rage window to insert them into the playlist. \
You can get a visual representation of everything on the playlist by hitting the / key, or just hovering your mouse over \
the right side of the window. Mouse back over the left side of the window ti dismiss it or press the key again. \
It has a full complement of key controls if you see the README for the full list. It will automatically search for \
album art for music files, if not already cached, and display that. It even generates thumbnails for the timeline \
of a video and allows you to preview the position on mouseover of the position bar at the bottom of the window."
LICENSE = "BSD-2-Clause"

PV = "0.4.0"

RPM_NAME = "rage-0.4.0-1.17.aarch64.rpm"
RPM_HASH = "9fb07db669d838d6bb0ca18edc71e28c325825b91ec8d24b8ed6dc23ace2190d49ac27c7ddcb55e3b8c490b9573d3a05ecbc8297ce5a93bc1c07c3bcf8ea109f"

RPROVIDES:${PN} += "rage"

RDEPENDS:${PN} += "efl \
elementary \
evas-generic-loaders \
ld-linux-aarch64.so.1 \
libc.so.6 \
libecore-con.so.1 \
libecore-file.so.1 \
libecore.so.1 \
libedje.so.1 \
libeet.so.1 \
libefreet.so.1 \
libeina.so.1 \
libeio.so.1 \
libeldbus.so.1 \
libelementary.so.1 \
libemotion.so.1 \
libevas.so.1 \
libm.so.6"

inherit rpm
