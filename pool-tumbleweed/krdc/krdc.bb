SUMMARY = "Remote Desktop Connection"
DESCRIPTION = "Krdc allows to connect to VNC and RDP compatible servers."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "krdc-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "e98a81cef5e0d7efa6a5f26659d969be139c3e443ed174d1856cd03af57bb5eb5ae08d80aae3e52a78f0ea3aafb15aeb48425f4e10704ac075bc2f9a9dfbb764"

RPROVIDES:${PN} += "krdc \
libkcm-krdc-rdpplugin.so \
libkcm-krdc-vncplugin.so \
libkrdccore.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
freerdp \
kf6-breeze-icons \
ld-linux-aarch64.so.1 \
libKF6Bookmarks.so.6 \
libKF6BookmarksWidgets.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DNSSD.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtils.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NotifyConfig.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6WaylandClient.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libfreerdp-client3.so.3 \
libfreerdp3.so.3 \
libqt6keychain.so.1 \
libssh.so.4 \
libstdc++.so.6 \
libvncclient.so.1 \
libwayland-client.so.0 \
libwinpr3.so.3"

inherit rpm
