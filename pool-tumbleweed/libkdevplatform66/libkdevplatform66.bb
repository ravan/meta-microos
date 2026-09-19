SUMMARY = "Libraries for Integrated Development Environments"
DESCRIPTION = "This package contains the libraries for integrated development \
environments based on the KDevelop framework."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkdevplatform66-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "2c8fa8586569d8052310777d2b55b4f7e350d54333d5d453818b4221cd0932f962e9b6d98fd9a43a64ad2f93d1f8b357b1fc664e08c6a7a3d49cfe516143b87f"

RPROVIDES:${PN} += "libKDevPlatformDebugger.so.66 \
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
libkdevplatform66"

RDEPENDS:${PN} += "/sbin/ldconfig \
kdevplatform \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6ItemModels.so.6 \
libKF6ItemViews.so.6 \
libKF6JobWidgets.so.6 \
libKF6KCMUtils.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NewStuffCore.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6NotifyConfig.so.6 \
libKF6Parts.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6TextEditor.so.6 \
libKF6TextTemplate.so.6 \
libKF6TextWidgets.so.6 \
libKF6ThreadWeaver.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
