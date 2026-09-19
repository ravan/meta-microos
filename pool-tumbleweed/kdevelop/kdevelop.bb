SUMMARY = "Plugin-extensible IDE for C/C++ and other programming languages"
DESCRIPTION = "KDevelop is an integrated development environment (IDE). \
It provides editing, navigation and debugging features for several programming languages, \
as well as integration with multiple build systems and version-control systems \
using a plugin-based architecture. \
KDevelop has parser backends for C, C++ and Javascript/QML, \
with further external plugins supporting e.g. PHP or Python."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdevelop-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "0ba6640ed7eef7d2808a34795c48456d646cde25749e22b003fe90e58c217d5822f6b5898d4ea4f8c1dba9cde27c134261a75e5731f0b50b4e93bfda211f3335"

RPROVIDES:${PN} += "cmake-KDevelop \
kdevelop \
kdevelop5 \
kdevelop5-plugin-clang-tidy \
libKDevCMakeCommon.so.66 \
libKDevClangPrivate.so.66 \
libKDevCompileAnalyzerCommon.so.66 \
libKDevelopSessionsWatch.so \
libkdevelopsessionsplugin.so \
qt6qmlimport-org.kde.plasma.private.kdevelopsessions \
qt6qmlimport-org.kde.plasma.private.kdevelopsessions.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
clang23 \
ld-linux-aarch64.so.1 \
libKDevPlatformDebugger.so.66 \
libKDevPlatformDocumentation.so.66 \
libKDevPlatformInterfaces.so.66 \
libKDevPlatformLanguage.so.66 \
libKDevPlatformOutputView.so.66 \
libKDevPlatformProject.so.66 \
libKDevPlatformSerialization.so.66 \
libKDevPlatformShell.so.66 \
libKDevPlatformSublime.so.66 \
libKDevPlatformUtil.so.66 \
libKDevPlatformVcs.so.66 \
libKF6Archive.so.6 \
libKF6Bookmarks.so.6 \
libKF6BookmarksWidgets.so.6 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6IconWidgets.so.6 \
libKF6ItemModels.so.6 \
libKF6ItemViews.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NewStuffCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Parts.so.6 \
libKF6Purpose.so.6 \
libKF6PurposeWidgets.so.6 \
libKF6Runner.so.6 \
libKF6Service.so.6 \
libKF6SonnetUi.so.6 \
libKF6TextEditor.so.6 \
libKF6TextTemplate.so.6 \
libKF6TextWidgets.so.6 \
libKF6ThreadWeaver.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Help.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6WebEngineCore.so.6 \
libQt6Widgets.so.6 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libclang.so.13 \
libgcc-s.so.1 \
libkomparediff2.so.6 \
libm.so.6 \
libprocesscore.so.11 \
libstdc++.so.6 \
libsvn-client-1.so.0 \
libsvn-subr-1.so.0 \
libsvn-wc-1.so.0 \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts.1 \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kitemmodels \
qt6qmlimport-org.kde.ksvg \
qt6qmlimport-org.kde.plasma.components \
qt6qmlimport-org.kde.plasma.extras \
qt6qmlimport-org.kde.plasma.plasmoid"

inherit rpm
