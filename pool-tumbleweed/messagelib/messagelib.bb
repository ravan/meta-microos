SUMMARY = "KDE PIM library for e-mail message parsing and display"
DESCRIPTION = "This package contains the messagelib library. It is used by KDE PIM to parse and \
display emails."
LICENSE = "GPL-2.0-only & GPL-3.0-only & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "messagelib-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a4075f22f9c7f2e9538a5eeccd6a6bac4ec498cf18e260d5612dcdeee18b3dcc36b5262bb7257988a5cf9da07a89e6f85de520f39822da7876e1330232cc5351"

RPROVIDES:${PN} += "libKPim6MessageComposer.so.6 \
libKPim6MessageCore.so.6 \
libKPim6MessageList.so.6 \
libKPim6MessageViewer.so.6 \
libKPim6MimeTreeParser.so.6 \
libKPim6TemplateParser.so.6 \
libKPim6WebEngineViewer.so.6 \
messagelib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6CalendarCore.so.6 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6IconWidgets.so.6 \
libKF6ItemModels.so.6 \
libKF6ItemViews.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Mime.so.6 \
libKF6Service.so.6 \
libKF6SonnetUi.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6TextAddonsWidgets.so.1 \
libKF6TextAutoCorrectionCore.so.1 \
libKF6TextCustomEditor.so.1 \
libKF6TextEditTextToSpeech.so.1 \
libKF6TextTemplate.so.6 \
libKF6TextUtils.so.1 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6AkonadiContactCore.so.6 \
libKPim6AkonadiContactWidgets.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiMime.so.6 \
libKPim6AkonadiSearchPIM.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6GrantleeTheme.so.6 \
libKPim6Gravatar.so.6 \
libKPim6IdentityManagementCore.so.6 \
libKPim6IdentityManagementWidgets.so.6 \
libKPim6Libkdepim.so.6 \
libKPim6Libkleo.so.6 \
libKPim6MailTransport.so.6 \
libKPim6Mbox.so.6 \
libKPim6PimCommon.so.6 \
libKPim6PimCommonAkonadi.so.6 \
libKPim6TextEdit.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgpgmepp.so.7 \
libm.so.6 \
libqgpgmeqt6.so.15 \
libstdc++.so.6"

inherit rpm
