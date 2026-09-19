SUMMARY = "Audio recording application"
DESCRIPTION = "Recorder is a simple, cross-platform audio recording application."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "krecorder-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "6a3b6f7d05200e8247a8ce77157236764caf086aab5382a343ceb67b8f59f9dbe5dbf5785e0d8ef90b3251f874d59a6333a8f6a8cbcb1a5ed219e4f105b129a9"

RPROVIDES:${PN} += "krecorder"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
