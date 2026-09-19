SUMMARY = "PyQt - devel part of python bindings for Qt 6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications"
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.11.0"

RPM_NAME = "python313-PyQt6-devel-6.11.0-2.3.aarch64.rpm"
RPM_HASH = "ef4b50225cb8aada51891de77a6ec4577fc8b1387d57bd50d67b9af0d0cec82e765f9dbfa2075ca9465645d569aa3041bf5e42b3563491515a2f37fa8e105a61"

RPROVIDES:${PN} += "libpy3.13qt6.so \
python3-PyQt6-devel \
python3-qt6-devel \
python313-PyQt6-devel \
python313-qt6-devel"

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
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi \
python313-PyQt6 \
python313-dbus-python-devel \
python313-devel \
qt6-base-devel \
qt6-macros \
update-alternatives"

inherit rpm
