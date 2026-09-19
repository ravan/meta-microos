SUMMARY = "RSS Feed Reader"
DESCRIPTION = "Akregator is a news feed reader. It enables you to follow news sites, \
blogs and other RSS/Atom-enabled websites without the need to \
manually check for updates using a web browser. Akregator is designed \
for convenient reading of hundreds of news sources. It comes with \
Konqueror integration for adding news feeds and with an internal \
browser for news reading."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "akregator-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "299135691482029fbdb6a2ceb424d627e87c78dc5b07a9822401782d0e3d1780b75b4473dad1f2b379fc0768f20c470a4c1b60074937791db839d4512e999f58"

RPROVIDES:${PN} += "akregator \
akregator5 \
libakregatorinterfaces.so.6 \
libakregatorprivate.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Notifications.so.6 \
libKF6NotifyConfig.so.6 \
libKF6Parts.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6Syndication.so.6 \
libKF6TextAddonsWidgets.so.1 \
libKF6TextEditTextToSpeech.so.1 \
libKF6TextTemplate.so.6 \
libKF6TextUtils.so.1 \
libKF6UserFeedbackCore.so.6 \
libKF6UserFeedbackWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6GrantleeTheme.so.6 \
libKPim6KontactInterface.so.6 \
libKPim6Libkdepim.so.6 \
libKPim6MessageViewer.so.6 \
libKPim6MimeTreeParser.so.6 \
libKPim6PimCommon.so.6 \
libKPim6PimCommonActivities.so.6 \
libKPim6WebEngineViewer.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
