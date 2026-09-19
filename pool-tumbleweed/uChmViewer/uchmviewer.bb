SUMMARY = "CHM and ePub Viewer"
DESCRIPTION = "This is a viewer for ebooks and documentation in CHM (Microsoft Compiled HTML) and ePub formats. \
It supports complex searching for large books and has various viewing features."
LICENSE = "GPL-3.0-only"

PV = "8.6"

RPM_NAME = "uChmViewer-8.6-1.3.aarch64.rpm"
RPM_HASH = "0b48ac502221bbb2ba87294adb5d5a4f92b872910033ce41a8bbceb21c22662380f90114254a90361a7701e38277370f85fe82bc62598363539ef136c3d6154f"

RPROVIDES:${PN} += "kchmviewer \
uChmViewer"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libchm.so.0 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzip.so.5"

inherit rpm
