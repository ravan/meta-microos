SUMMARY = "Disk Usage Viewer"
DESCRIPTION = "KDE free disk space utility"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdf-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "62887eb8de9783979b44e31b5886dd2377ee24afba85a7f6c965fe519cdb0f97ed5eaa47416f35015eeb58fc91f81c10ebcf08c7f8b4e08f12a890638cd6f9df"

RPROVIDES:${PN} += "kdf \
libkdfprivate.so.26"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconWidgets.so.6 \
libKF6JobWidgets.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6Service.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
