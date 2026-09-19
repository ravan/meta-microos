SUMMARY = "RSS/ATOM/RDF feed reader"
DESCRIPTION = "RSS Guard is a RSS/ATOM feed aggregator developed using the Qt framework. \
It supports online feed synchronization."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-only & LGPL-2.1-only & LGPL-3.0-or-later"

PV = "5.2.5"

RPM_NAME = "rssguard-5.2.5-1.1.aarch64.rpm"
RPM_HASH = "179c3736ab66c9169bdfcec140975132cdbf2da428b5050882956f803cda16336c4d05345ceaf3795a02069e65a8873234a5259d3a870bc2d2b5b061bf3a6736"

RPROVIDES:${PN} += "librssguard-feedly.so \
librssguard-gmail.so \
librssguard-greader.so \
librssguard-nextcloud.so \
librssguard-standard.so \
librssguard-ttrss.so \
rssguard \
rssguard-lang"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
librssguard-5.2.5.so \
libstdc++.so.6 \
qt6-sql-sqlite"

inherit rpm
