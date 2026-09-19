SUMMARY = "LeechCraft RSS/Atom Aggregator Module"
DESCRIPTION = "This package provides a RSS/Atom feed reader plugin for LeechCraft. \
 \
It features: \
 * RSS 0.92/0.93/1.0/2.0, Atom 0.3/1.0; \
 * extensions like GeoRSS, MediaRSS, Comment API etc; \
 * OPML support; \
 * broadcatching and fetching arbitrary data with regexps; \
 * tape mode for news display; \
 * individual options for each channel like update interval; \
 * storage either in SQLite or PostgreSQL; \
 * exporting feeds to FB2 for further reading on handheld devices. \
 \
A web browser plugin is recommended to show the news in a fancy way."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-aggregator-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "3053f20d8d5185cbeed1aab25f7c0f84ae0a7be5c4b68a27ec4b0337da5422cd8e5aa470cab8a79b6454645465a945ee4e30d89988341fc14ddda6cf5c2e0d1b"

RPROVIDES:${PN} += "leechcraft-aggregator \
libleechcraft-aggregator.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-http \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt6.so.0.6.75 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-shortcuts-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-tags-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6 \
qt6-sql-sqlite"

inherit rpm
