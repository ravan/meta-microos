SUMMARY = "PyQt - devel part of python bindings for Qt 5"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.10"

RPM_NAME = "python313-qt5-devel-5.15.10-4.8.aarch64.rpm"
RPM_HASH = "2327660bac7f306578053f179188188deeb8f76d6dc30ad6865d8b9a28465498f091448e6526d2b514fde743f7efd4ac53ae50782aaf167c514075bbc02c2b7e"

RPROVIDES:${PN} += "libpy3.13qt5.so \
python-qt5-common-devel \
python-qt5-utils \
python3-PyQt5-devel \
python3-qt5-devel \
python313-PyQt5-devel \
python313-qt5-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.13.so.1.0 \
libqt5-qtbase-devel \
libstdc++.so.6 \
pkgconfig-Qt5Bluetooth \
pkgconfig-Qt5Designer \
pkgconfig-Qt5Help \
pkgconfig-Qt5Location \
pkgconfig-Qt5Multimedia \
pkgconfig-Qt5MultimediaWidgets \
pkgconfig-Qt5Nfc \
pkgconfig-Qt5Positioning \
pkgconfig-Qt5Qml \
pkgconfig-Qt5Quick \
pkgconfig-Qt5QuickWidgets \
pkgconfig-Qt5SerialPort \
pkgconfig-Qt5Svg \
pkgconfig-Qt5TextToSpeech \
pkgconfig-Qt5UiTools \
pkgconfig-Qt5WebChannel \
pkgconfig-Qt5WebSockets \
pkgconfig-Qt5X11Extras \
pkgconfig-Qt5XmlPatterns \
python-abi \
python313-dbus-python-devel \
python313-devel \
python313-qt5 \
update-alternatives"

inherit rpm
