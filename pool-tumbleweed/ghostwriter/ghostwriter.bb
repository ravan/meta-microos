SUMMARY = "A distraction-free Markdown editor"
DESCRIPTION = "ghostwriter is a text editor for Markdown, which is a plain text markup format. \
For more information about Markdown, please visit John Gruber’s website at \
http://www.daringfireball.net. \
Ghostwriter provides a relaxing, distraction-free writing environment."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "ghostwriter-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "e699a8ea10bf77714f06b268ef9e7f8203bb35690b1680682c7375f12b0325fa953002cb73a5ece7c80b3eb2f468b86113471d1e5c36c0211d7b6a2d1f854f45"

RPROVIDES:${PN} += "ghostwriter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6SonnetCore.so.6 \
libKF6SonnetUi.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
