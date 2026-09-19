SUMMARY = "A third-party lyrics display program"
DESCRIPTION = "OSD Lyrics is a lyrics show compatible with various media players. It is not a \
plugin but a standalone program. OSD Lyrics shows lyrics on your desktop, in the \
style similar to KaraOK. It also provides another displaying style, in which \
lyrics scroll from bottom to top. OSD Lyrics can download lyrics from the \
network automatically."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.15"

RPM_NAME = "osdlyrics-0.5.15-4.4.aarch64.rpm"
RPM_HASH = "c918640520f3e608a36bf41841bac9145fe8b7a4f4ea560b3b03ce9e60cced6c3af3ff2cf87248bd87b56ba79e614d0a1f48f67b389f8907eecbdecf2ed9f847"

RPROVIDES:${PN} += "osdlyrics"

RDEPENDS:${PN} += "/usr/bin/sh \
gtk2 \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libappindicator.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbus-glib-1.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
python3-chardet \
python3-pycurl \
sqlite3"

inherit rpm
