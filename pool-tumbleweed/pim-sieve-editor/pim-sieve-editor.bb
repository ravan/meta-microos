SUMMARY = "Sieve scripts editor for KDE PIM applications"
DESCRIPTION = "This package provides an editor, complete with syntax highlighting and \
command completion, to edit Sieve scripts ('server side filtering') \
in KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "pim-sieve-editor-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "5a0a84c5ce64f99391609773f0b4e416640281be49d9bb758852e0a60e7b1974d18cc341eae91009e5bb4064b9f778afa5e583b1ca77a3373eae68baaf6cb001"

RPROVIDES:${PN} += "libsieveeditor.so.6 \
pim-sieve-editor"

RDEPENDS:${PN} += "/sbin/ldconfig \
kmail \
ld-linux-aarch64.so.1 \
libKF6Bookmarks.so.6 \
libKF6BookmarksWidgets.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6TextAddonsWidgets.so.1 \
libKF6TextAutoGenerateText.so.1 \
libKF6UserFeedbackCore.so.6 \
libKF6UserFeedbackWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libKPim6KManageSieve.so.6 \
libKPim6KSieveCore.so.6 \
libKPim6KSieveUi.so.6 \
libKPim6MailTransport.so.6 \
libKPim6PimCommon.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libqt6keychain.so.1 \
libstdc++.so.6"

inherit rpm
