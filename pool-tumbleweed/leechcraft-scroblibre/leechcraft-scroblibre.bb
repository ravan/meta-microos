SUMMARY = "LeechCraft Submissions Protocol Scrobble Module"
DESCRIPTION = "This package contains a Scroblibre plugin for LeechCraft. \
 \
It is an implementation of the submissions protocol 1.2 with \
support ( http://www.audioscrobbler.net/development/protocol ) \
for sites other than last.fm (libre.fm for now). It can \
potentially handle arbitrary scrobbling URLs implementing the \
submissions protocol, but it is not exposed in the GUI (yet). \
 \
Scroblibre is a supplement for the LastFMScrobble module, and the \
latter is still the recommended one because of all the social \
features it offers which Scroblibre lacks."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-scroblibre-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "57fc55c3c437425e4b8d7f3569e3511af1b14bd2509937c09e8259f9672899044fee37e6d934df56d44c048610c987622dff676ea1b75d4da19ac83e42927ec6"

RPROVIDES:${PN} += "leechcraft-scrobbler \
leechcraft-scroblibre \
libleechcraft-scroblibre.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
