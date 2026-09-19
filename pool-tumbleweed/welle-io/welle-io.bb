SUMMARY = "Receiver for DAB and DAB+ broadcast radio"
DESCRIPTION = "Receive digital audio broadcasts with your computer: welle.io is an open source \
DAB and DAB+ software defined radio (SDR) with direct support for RTL-SDR and \
other SDR hardware through SoapySDR. It supports high DPI and touch displays and \
it runs even on cheap computers."
LICENSE = "GPL-2.0-or-later"

PV = "2.7"

RPM_NAME = "welle-io-2.7-1.6.aarch64.rpm"
RPM_HASH = "be1018380fa801eea52235988e21ed62246ee3cd66916ddb286f8d28f96a98754a533533379a302b42e17ec4de155e36475bf5dc565d42606fcf041b2055de02"

RPROVIDES:${PN} += "welle-io"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libSoapySDR.so.0.8-3 \
libairspy.so.0 \
libc.so.6 \
libfdk-aac.so.2 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libmpg123.so.0 \
librtlsdr.so.0 \
libstdc++.so.6 \
qt6-charts-imports \
qt6-multimedia-imports \
qt6-qt5compat-imports"

inherit rpm
