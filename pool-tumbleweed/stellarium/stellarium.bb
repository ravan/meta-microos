SUMMARY = "Astronomical Sky Simulator"
DESCRIPTION = "Stellarium is a software to render 3D photo-realistic skies in real \
time, similar to what can be observed with human eyes through \
binoculars or a small telescope."
LICENSE = "GPL-2.0-or-later"

PV = "26.2"

RPM_NAME = "stellarium-26.2-1.1.aarch64.rpm"
RPM_HASH = "f6e56ad4bed057b585939471a9ff2027ad614c60ce1740fe2a421f8ae4206483ab1292d127692a727b316efb4556cf1abfe100ceadc5b7ad1e125573a4763a8a"

RPROVIDES:${PN} += "stellarium"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libQt6Charts.so.6 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6MultimediaWidgets.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libQt6SerialPort.so.6 \
libQt6SvgWidgets.so.6 \
libQt6TextToSpeech.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libgps.so.32 \
libindiclient.so.2 \
libm.so.6 \
libmd4c-html.so.0 \
libnlopt.so.1 \
libstdc++.so.6 \
libz.so.1 \
qt6-multimedia"

inherit rpm
