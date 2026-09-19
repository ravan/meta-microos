SUMMARY = "Plugins responsible for better integration of Qt applications in KDE Workspace"
DESCRIPTION = "Framework Integration is a set of plugins responsible for better \
integration of Qt applications when running on a \
KDE Plasma workspace. \
 \
Applications do not need to link to this directly."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5Style5-5.116.0-2.5.aarch64.rpm"
RPM_HASH = "d06eec855570e9c9ec3fa6e552ada7bf6c4929230e8cf1bcea305af34bf9a27c66a707f9b4ef29f991df63e90648a57e5148c7f94a3a8bc907d5a258e9a4dac6"

RPROVIDES:${PN} += "libKF5Style.so.5 \
libKF5Style5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5IconThemes.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
