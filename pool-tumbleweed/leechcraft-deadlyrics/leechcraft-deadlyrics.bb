SUMMARY = "LeechCraft Lyrics finder Module"
DESCRIPTION = "This package provides a lyrics finder plugin for LeechCraft. \
 \
It is a simple client for searching song lyrics on various sites. \
The search interface is available via LeechCraft Summary."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-deadlyrics-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "ef5150445008e8ff8dfe144bad6eb2cba622fbb05eee2c3adf414ea506f9dfdc9230966619411b2ae2dd6ed49cefe595c93aa7632a090c46081c090bc6588b24"

RPROVIDES:${PN} += "leechcraft-deadlyrics \
leechcraft-lyricsprovider \
libleechcraft-deadlyrics.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-http \
leechcraft-summaryrepresentation \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-network-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
