SUMMARY = "Widgets for configuration dialogs: Build Environment"
DESCRIPTION = "KConfigWidgets provides easy-to-use classes to create configuration dialogs, as \
well as a set of widgets which uses KConfig to store their settings. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kconfigwidgets-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "20b8823a5d8f5ef5a356c4268ca2a87ba760897266bfc420e6022fd099b24ee3a898b48d7c63c15c092cb0d4bb7dd9a9d66bdcedbd7e3da0adef2b618b790f32"

RPROVIDES:${PN} += "cmake-KF5ConfigWidgets \
kconfigwidgets-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
cmake-KF5Auth \
cmake-KF5Codecs \
cmake-KF5Config \
cmake-KF5WidgetsAddons \
ld-linux-aarch64.so.1 \
libKF5ConfigWidgets.so.5 \
libKF5ConfigWidgets5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
