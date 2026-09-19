SUMMARY = "Client for the Music Player Daemon (MPD)"
DESCRIPTION = "Cantata is a graphical client for MPD, supporting the following features: \
 * Multiple MPD collections. \
 * Customisable layout. \
 * Songs grouped by album in play queue. \
 * Context view to show artist, album, and song information of \
   current track. \
 * Tag editor. \
 * File organizer - use tags to organize files and folders. \
 * Ability to calculate ReplyGain tags \
 * Dynamic playlists. \
 * Online services; Jamendo, Magnatune, SoundCloud, and Podcasts. \
 * Radio stream support - with the ability to search for streams via \
   TuneIn, ShoutCast, or Dirble. \
 * USB-Mass-Storage and MTP device support \
 * Audio CD ripping and playback \
 * Playback of non-MPD songs - via simple in-built HTTP server if \
   connected to MPD via a standard socket, otherwise filepath is sent \
   to MPD. \
 * MPRISv2 DBUS interface. \
 * Basic support for touch-style interface (views are made \
   'flickable'). \
 * Scrobbling. \
 * Ratings support. \
 \
Cantata started off as a fork of QtMPC, however, the code (and user \
interface) is now very different to that of QtMPC. For more detailed \
information, please refer to the main README."
LICENSE = "GPL-3.0-only"

PV = "3.5.0"

RPM_NAME = "cantata-3.5.0-1.2.aarch64.rpm"
RPM_HASH = "38d32803959fdb1d32d1240c9755e4d191dbad7a93b2ed59a0248bc30a4d7f148461fd348162e20752b38abbd771da7dd3cdec1940ffdf410125ca76878efcb9"

RPROVIDES:${PN} += "cantata"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
fontawesome-fonts \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ItemViews.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcddb.so.2 \
libcdio-cdda.so.2 \
libcdio-paranoia.so.2 \
libebur128.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libmpg123.so.0 \
libmtp.so.9 \
libmusicbrainz5.so.1 \
libstdc++.so.6 \
libtag.so.2 \
libudev.so.1 \
media-player-info \
mpd \
qt6-sql-sqlite"

inherit rpm
