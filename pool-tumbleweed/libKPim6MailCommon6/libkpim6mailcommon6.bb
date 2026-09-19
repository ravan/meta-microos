SUMMARY = "Common Mail library for KDE PIM applications"
DESCRIPTION = "This package provides the mailcommon library, a base KDE PIM library \
to build email-handling applications."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6MailCommon6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "4a113e8bc70f92ea7a6139ce8171273ae00f2ecf20a4ab87e4c0672f27ff933db93676079b679c6bab3f20cc96c80969f66be85b03aa092753f1cd82e3e771a4"

RPROVIDES:${PN} += "libKPim6MailCommon.so.6 \
libKPim6MailCommon6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconWidgets.so.6 \
libKF6ItemViews.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Mime.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6TextCustomEditor.so.1 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6AkonadiContactCore.so.6 \
libKPim6AkonadiContactWidgets.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiMime.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6IdentityManagementCore.so.6 \
libKPim6IdentityManagementWidgets.so.6 \
libKPim6Libkdepim.so.6 \
libKPim6Libkleo.so.6 \
libKPim6MailImporter.so.6 \
libKPim6MailTransport.so.6 \
libKPim6MessageComposer.so.6 \
libKPim6MessageCore.so.6 \
libKPim6MessageList.so.6 \
libKPim6MessageViewer.so.6 \
libKPim6PimCommon.so.6 \
libKPim6PimCommonAkonadi.so.6 \
libKPim6TemplateParser.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgpgmepp.so.7 \
libqgpgmeqt6.so.15 \
libstdc++.so.6 \
mailcommon"

inherit rpm
