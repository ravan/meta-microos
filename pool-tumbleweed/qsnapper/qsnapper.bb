SUMMARY = "Qt Gui application for managing btrfs snapshots"
DESCRIPTION = "qSnapper is a graphical user interface for the Snapper snapshot management \
tool. It provides an intuitive way to create, browse, and manage filesystem \
snapshots on Btrfs and other supported filesystems."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.3"

RPM_NAME = "qsnapper-1.3.3-1.4.aarch64.rpm"
RPM_HASH = "1f4aa4c9accde4c6b1e40e96f1cbc0ba58c30fd2bf22fa6b14544cda08a1601a12966ae0e5ecbad1587cf52b3cc5e0057c89733e78fc69671ad9515ac37fdd59"

RPROVIDES:${PN} += "qsnapper"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libbtrfsutil.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpolkit-qt6-core-1.so.1 \
libsnapper.so.8 \
libstdc++.so.6"

inherit rpm
