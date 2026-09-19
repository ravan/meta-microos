SUMMARY = "Certificate manager and GUI for OpenPGP and CMS cryptography"
DESCRIPTION = "Kleopatra is a certificate manager and GUI for OpenPGP and CMS cryptography."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kleopatra-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "56364fd37459605cf102dcb5b8d6d7bd5d3f0396f7bd1998e35b8571feb3835cd9110b93debadb219a543aa90f1b89389b9c49b318899c0cf5d7fe353f0b8017"

RPROVIDES:${PN} += "kleopatra \
kleopatra5"

RDEPENDS:${PN} += "dirmngr \
gpg2 \
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
libKF6IconWidgets.so.6 \
libKF6ItemModels.so.6 \
libKF6KIOCore.so.6 \
libKF6Mime.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libKPim6AkonadiMime.so.6 \
libKPim6IdentityManagementCore.so.6 \
libKPim6Libkleo.so.6 \
libKPim6MailTransport.so.6 \
libKPim6MimeTreeParserWidgets.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libassuan.so.9 \
libc.so.6 \
libgcc-s.so.1 \
libgpg-error.so.0 \
libgpgmepp.so.7 \
libkdsingleapplication-qt6.so.1.2 \
libqgpgmeqt6.so.15 \
libstdc++.so.6"

inherit rpm
