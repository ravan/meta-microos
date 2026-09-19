SUMMARY = "Official authentication app for German ID cards and residence permits"
DESCRIPTION = "This app is developed and issued by the German government to be \
used for online authentication with electronic German ID cards \
and residence permits. To use this app, a supported RFID card \
reader or compatible NFC smart phone is required."
LICENSE = "EUPL-1.2"

PV = "2.5.5"

RPM_NAME = "AusweisApp-2.5.5-1.1.aarch64.rpm"
RPM_HASH = "58d72e545caa2454397fc6b26118aa02b9672fd4b6d4e0196b03d9f790c950b69173677a1c2c6e802b661db5ce464847acffce3b0d73ec00832c2d08e84d1d9d"

RPROVIDES:${PN} += "AusweisApp \
AusweisApp2"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6StateMachine.so.6 \
libQt6Svg.so.6 \
libQt6Svg6 \
libQt6WebSockets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcrypto.so.3 \
libllhttp.so.9.3 \
libpcsclite.so.1 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
