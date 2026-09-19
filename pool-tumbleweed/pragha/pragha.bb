SUMMARY = "Lightweight Music Player"
DESCRIPTION = "A Lightweight Music Player for GNU/Linux, based on Gtk, sqlite, and \
completely written in C, constructed to be fast, light, and \
simultaneously complete without obstructing the daily work. \
 \
Pragha was originally derived of Consonance Music Manager \
(http://sites.google.com/site/consonancemanager/), discontinued by the \
original author. \
 \
Some of the features are: \
* Library management using sqlite3. \
* Versatile Amarok-style play queue. \
* Multiple views. \
* OSD support with Libnotify. \
* Id3 tag editing. \
* mp3, ogg, flac, modplug, wav, asf, wma, mp4, m4a, MonkeyAudio and \
  Audio CD support. \
* Last.fm scrobbling, get cover art, get artist information, append \
  similar songs, love, unlove, etc. \
* Playlist management (M3U Exporting). \
* DBUS management interface. \
* MPRIS2 Support. \
* Search/Filterin the current playlist. \
* Search lyrics."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.99.1"

RPM_NAME = "pragha-1.3.99.1-5.7.aarch64.rpm"
RPM_HASH = "31d830dcfc66a48f9d72e43d72b2cbd86f3f9a338e0fa748cda6163894cc8dab3a6c03d33abbc534f389eecca467cfe5ff050f0aa05e20abac58c5e05007433a"

RPROVIDES:${PN} += "libpragha.so \
pragha"

RDEPENDS:${PN} += "gstreamer-plugins-base \
gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpeas-1.0.so.1 \
libpeas-gtk-1.0.so.1 \
libsqlite3.so.0 \
libtag-c.so.2 \
libtotem-plparser.so.18 \
libxfce4ui-2.so.0"

inherit rpm
