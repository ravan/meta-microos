SUMMARY = "KDE PIM Libraries: Mailtransport layer"
DESCRIPTION = "This package contains library to provide mailtransport functionality for \
KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kmailtransport-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "f1ba5da42315f4085c01c9db943dd7e8be4e3c1ef2bf664a020cdafb80bec1543789474e206457752ef750e9b4f93bc5db645158c22ddd1ab7165610a372150f"

RPROVIDES:${PN} += "kmailtransport"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKPim6GAPICore.so.6 \
libKPim6MailTransport.so.6 \
libKPim6SMTP.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libqt6keychain.so.1 \
libstdc++.so.6"

inherit rpm
