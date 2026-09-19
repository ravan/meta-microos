SUMMARY = "Paint Program"
DESCRIPTION = "Paint program by KDE."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kolourpaint-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "bdf26d996a79208266216c49a86a1586b7f1e3f5dd541ac62ee718c68af1e45f9cffa87d4d721a4a166b8debde49d78afffdd8ecfdac8264c1b9d5ebc86f36bd"

RPROVIDES:${PN} += "kolourpaint \
kolourpaint5 \
libkolourpaint-lgpl.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKSaneWidgets6.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
