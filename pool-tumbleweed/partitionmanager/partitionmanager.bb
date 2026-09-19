SUMMARY = "Easily manage disks, partitions and file systems on your KDE Desktop"
DESCRIPTION = "This software allows you to manage your disks, partitions and \
file systems: Create, resize, delete, copy, backup and restore \
partitions with a large number of supported file systems (ext2/3, \
reiserfs, NTFS, FAT32 and more). It makes use of external \
programs to get its job done, so you might have to install \
additional software (preferably packages from your distribution) \
to make use of all features and get full support for all file \
systems."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "partitionmanager-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "fdbc721db35718ab5ae7eca8b1de5e59a0e14a1222ccc3635a23c12c7ed56b0ffc399edce2a0a62f3fbadff354cac145a8f3f497179c81063e29f3a4d3f7eaaa"

RPROVIDES:${PN} += "partitionmanager \
partitionmanager5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libkpmcore.so.13 \
libpolkit-qt6-core-1.so.1 \
libstdc++.so.6"

inherit rpm
