SUMMARY = "UI Files Viewer"
DESCRIPTION = "Displays Qt Designer UI files"
LICENSE = "GFDL-1.2-only & GPL-2.0-only & LGPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kuiviewer-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "493f2b474d45f417362848bdc9a0f61d42d098bae5bf60046affb21890dc71d2dd6a0974bed1f712e55f31886747f4a5566f6b263b939c9b2f04ba05771d441c"

RPROVIDES:${PN} += "kuiviewer"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOGui.so.6 \
libKF6Parts.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Designer.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
