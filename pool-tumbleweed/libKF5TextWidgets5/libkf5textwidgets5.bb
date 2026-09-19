SUMMARY = "KDE Text editing widgets"
DESCRIPTION = "KTextWidgets provides widgets for displaying and editing text. It supports \
rich text as well as plain text."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5TextWidgets5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "1f629ee2321f2d64c23b0c56a77a9fbf963fba25e63c60845305c6b03893d7c94c6752f13fbcb808ed87a42536359bf469c4cd68d3b11d2b9173fd4b4b7fc574"

RPROVIDES:${PN} += "libKF5TextWidgets.so.5 \
libKF5TextWidgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5I18n.so.5 \
libKF5SonnetCore.so.5 \
libKF5SonnetUi.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5TextToSpeech.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
