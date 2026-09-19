SUMMARY = "Screen Capture Program"
DESCRIPTION = "Spectactle is a screenshot-taking program made by KDE. It allows taking screenshots \
of screens, windows, regions of the screen, and to export them to files or other \
online services."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "spectacle-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "39611869c7dae63412625afc7035cf202fbbf9427548db6a887bbda339a3149b6dc3ba8b5429a3c9394816f8dabe31fc42c2d194aba5beb291ddee5f7ffe29e9"

RPROVIDES:${PN} += "spectacle"

RDEPENDS:${PN} += "/usr/bin/sh \
kquickimageeditor6-imports \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6PrisonScanner.so.6 \
libKF6Purpose.so.6 \
libKF6PurposeWidgets.so.6 \
libKF6Service.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libKPipeWireRecord.so.6 \
libKQuickImageEditor.so.1 \
libKirigamiPlatform.so.6 \
libLayerShellQtInterface.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WaylandClient.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-core.so.413 \
libopencv-imgproc.so.413 \
libstdc++.so.6 \
libtesseract.so.5 \
libwayland-client.so.0 \
libxcb-cursor.so.0 \
libxcb-image.so.0 \
libxcb-randr.so.0 \
libxcb-util.so.1 \
libxcb-xfixes.so.0 \
libxcb.so.1 \
qt6-imageformats"

inherit rpm
