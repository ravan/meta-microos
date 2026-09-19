SUMMARY = "KDE Text editing widgets"
DESCRIPTION = "KTextWidgets provides widgets for displaying and editing text. It supports \
rich text as well as plain text."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6TextWidgets6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "b660a0db17831b50a49b1b673487da364cfc3c4ee1c76c5891f1a7251318cecedcf90054ec1feab10e4f061ee4763ce1c3313b642383d46ea49baeb36d06ac82"

RPROVIDES:${PN} += "libKF6TextWidgets.so.6 \
libKF6TextWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Completion.so.6 \
libKF6ConfigGui.so.6 \
libKF6I18n.so.6 \
libKF6SonnetCore.so.6 \
libKF6SonnetUi.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6TextToSpeech.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
