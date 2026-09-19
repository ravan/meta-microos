SUMMARY = "Backup program based on KDE Frameworks 5"
DESCRIPTION = "kbackup is a backup program based on KDE Frameworks 5. It allows backing \
folders and files up and setting profiles to exclude or include directories \
or files from the backup. It can save to both local files or remote locations. \
Although GUI based, it also offers an automated, GUI-less mode."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kbackup-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "2ebe7e7e759fdfc09dbee193c7fe2205e2b853f7f2ffbccad3994bd2bc03ff95d873d81cab3e8cbf84f7fa782c65ef62897b0bb20342a0d8c20cb79796f2eaf2"

RPROVIDES:${PN} += "kbackup"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Service.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libarchive.so.13 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
