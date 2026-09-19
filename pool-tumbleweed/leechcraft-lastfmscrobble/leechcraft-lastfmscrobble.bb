SUMMARY = "LeechCraft Last.FM Scrobble Module"
DESCRIPTION = "This package contains the LastFMScrobble plugin for LeechCraft \
which supports the Last.FM service. For example, it scrobbles tracks \
from other players, requests similar artists (on demand by other players as \
well), supports fetching album art, etc. \
 \
Features: \
 * Scrobbling listened tracks from other players like LMP to Last.FM. \
 * 'Loving' listened tracks. \
 * Support for requesting artists that are similar to a given artist. \
 * Automatic fetching of album art. \
 * Support for Last.FM radio. \
 * Fetching personalized recommendations. \
 * Fetching recent releases of artists that are in the user's collection. \
 * Fetching artists biography. \
 * Configurable language of the fetched information."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-lastfmscrobble-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "a7fb82847b9adbbf3705ba65fbe328f2b2475540f47034c13ef310ad535cb266e6c9151c9c2303a38277cf30881d170962d1fab7697cd992f9cd80e9c29878b6"

RPROVIDES:${PN} += "leechcraft-lastfmscrobble \
leechcraft-scrobbler \
libleechcraft-lastfmscrobble.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-lmp \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
liblastfm6.so.1 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-network-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
