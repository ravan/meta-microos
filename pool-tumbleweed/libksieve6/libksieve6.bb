SUMMARY = "Sieve and Managesieve support library for KDE PIM applications"
DESCRIPTION = "This package contains the libksieve library, which is used to support \
the Sieve server-side mail filtering protocol in KDE PIM applications."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libksieve6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "7792411d48770fc54b0d99222132869669d6a8668f01908d551fab65bff19b5cb862f2c30403256da2f3405942e9cad51dc905e4145f5f6590c9eb87d91878fb"

RPROVIDES:${PN} += "libKPim6KManageSieve.so.6 \
libKPim6KSieve.so.6 \
libKPim6KSieveCore.so.6 \
libKPim6KSieveUi.so.6 \
libksieve6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Mime.so.6 \
libKF6SonnetUi.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6TextAddonsWidgets.so.1 \
libKF6TextAutoGenerateText.so.1 \
libKF6TextCustomEditor.so.1 \
libKF6TextEditTextToSpeech.so.1 \
libKF6TextUtils.so.1 \
libKF6WidgetsAddons.so.6 \
libKPim6IdentityManagementCore.so.6 \
libKPim6Libkdepim.so.6 \
libKPim6PimCommon.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libksieve \
libsasl2.so.3 \
libstdc++.so.6"

inherit rpm
