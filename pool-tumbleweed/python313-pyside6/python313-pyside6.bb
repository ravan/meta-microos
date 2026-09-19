SUMMARY = "Python bindings for Qt 6"
DESCRIPTION = "Python bindings for the Qt cross-platform application and UI framework."
LICENSE = "(GPL-2.0-only & (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0) | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "python313-pyside6-6.11.2-1.2.aarch64.rpm"
RPM_HASH = "3e8f3bcd798495ba1954d782c2fa1b1e132a0d03fdc1057c85a0dba6ae019ead63cebed3187bc2587650c770dd8c9bfd23017f7da3438d0fe4ae48e12a9ace39"

RPROVIDES:${PN} += "libPySidePlugin.so \
libpyside6.abi3.so.6.11 \
libpyside6qml.abi3.so.6.11 \
python3-pyside6 \
python3.13dist-pyside6 \
python313-pyside6 \
python3dist-pyside6"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt63DAnimation.so.6 \
libQt63DCore.so.6 \
libQt63DExtras.so.6 \
libQt63DInput.so.6 \
libQt63DLogic.so.6 \
libQt63DRender.so.6 \
libQt6Bluetooth.so.6 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6DataVisualization.so.6 \
libQt6Designer.so.6 \
libQt6Graphs.so.6 \
libQt6GraphsWidgets.so.6 \
libQt6Gui.so.6 \
libQt6Help.so.6 \
libQt6HttpServer.so.6 \
libQt6Location.so.6 \
libQt6Multimedia.so.6 \
libQt6MultimediaWidgets.so.6 \
libQt6Network.so.6 \
libQt6NetworkAuth.so.6 \
libQt6Nfc.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Pdf.so.6 \
libQt6PdfWidgets.so.6 \
libQt6Positioning.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick3D.so.6 \
libQt6QuickControls2.so.6 \
libQt6QuickTest.so.6 \
libQt6QuickWidgets.so.6 \
libQt6RemoteObjects.so.6 \
libQt6Scxml.so.6 \
libQt6Sensors.so.6 \
libQt6SerialBus.so.6 \
libQt6SerialPort.so.6 \
libQt6SpatialAudio.so.6 \
libQt6Sql.so.6 \
libQt6StateMachine.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Test.so.6 \
libQt6TextToSpeech.so.6 \
libQt6UiTools.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6WebSockets.so.6 \
libQt6WebView.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.13.so.1.0 \
libshiboken6.abi3.so.6.11 \
libstdc++.so.6 \
python-abi \
python313-shiboken6"

inherit rpm
