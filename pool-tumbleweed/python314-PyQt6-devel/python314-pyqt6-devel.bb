SUMMARY = "PyQt - devel part of python bindings for Qt 6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications"
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.11.0"

RPM_NAME = "python314-PyQt6-devel-6.11.0-2.3.aarch64.rpm"
RPM_HASH = "89223cb004116b92e2aba2d7d416752ca32304f7d816c3deb361b5ed11082fa6abbd676d5d0c3a8b6b2a9f7e60d0541c92b9ff76009f5fa8cdcd44415964b458"

RPROVIDES:${PN} += "libpy3.14qt6.so \
python314-PyQt6-devel \
python314-qt6-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
cmake-Qt6Bluetooth \
cmake-Qt6DBus \
cmake-Qt6Designer \
cmake-Qt6Help \
cmake-Qt6Multimedia \
cmake-Qt6MultimediaWidgets \
cmake-Qt6Network \
cmake-Qt6Nfc \
cmake-Qt6OpenGL \
cmake-Qt6OpenGLWidgets \
cmake-Qt6Positioning \
cmake-Qt6PrintSupport \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Quick3D \
cmake-Qt6Quick3DRuntimeRender \
cmake-Qt6QuickWidgets \
cmake-Qt6RemoteObjects \
cmake-Qt6Sensors \
cmake-Qt6SerialPort \
cmake-Qt6SpatialAudio \
cmake-Qt6Sql \
cmake-Qt6Svg \
cmake-Qt6SvgWidgets \
cmake-Qt6Test \
cmake-Qt6TextToSpeech \
cmake-Qt6WebChannel \
cmake-Qt6WebSockets \
cmake-Qt6Widgets \
cmake-Qt6Xml \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.14.so.1.0 \
libstdc++.so.6 \
python-abi \
python314-PyQt6 \
python314-dbus-python-devel \
python314-devel \
qt6-base-devel \
qt6-macros \
update-alternatives"

inherit rpm
