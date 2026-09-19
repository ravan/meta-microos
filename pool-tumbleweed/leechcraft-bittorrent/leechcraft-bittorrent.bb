SUMMARY = "LeechCraft BitTorrent client Module"
DESCRIPTION = "This package provides a BitTorrent client for Leechcraft. \
 \
Features: \
 * Support for DHT and magnet links \
 * Sequential download mode where torrent is download sequentially. \
 * Torrents queue, limiting number of seeding/leeching torrents. \
 * Ability to rename files and directories in the torrent. \
 * Selective download: possibility to select specific files from torrent. \
 * Continue downloads left by any other client. \
 * Support for sparse files. \
 * Tags for torrents. \
 * Global and per-torrent speed limits. \
 * Connection number limits. \
 * Fast resume support to avoid long startup times. \
 * IP filter to block/unblock unwanted peers. \
 * Support for extension protocol"
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-bittorrent-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "b282a516baac81913622768bf6ec2961587e8cc0c8bfa4ddbc3a8745b2ec6a6c99eed83afd4a5582d9d422d44d38e8d8f993876dd723c90a25251ce4efd362e8"

RPROVIDES:${PN} += "leechcraft-bittorrent \
libleechcraft-bittorrent.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-shortcuts-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-tags-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libm.so.6 \
libmaxminddb.so.0 \
libstdc++.so.6 \
libtorrent-rasterbar.so.2.0"

inherit rpm
