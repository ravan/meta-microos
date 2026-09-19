SUMMARY = "Diagnostic Log and Trace viewing program"
DESCRIPTION = "The Diagnostic Log and Trace Viewer is an application that can send and receive control messages to the DLT daemon."
LICENSE = "MPL-2.0"

PV = "2.23.0"

RPM_NAME = "dlt-viewer-2.23.0-1.16.aarch64.rpm"
RPM_HASH = "852265c5e9aa88be2c0e7ebabdc53fb81e7a71856fcee89bafbcc2435a5b9bef31602c385cbb5fccad34e63e456ce84cc2dd6df2b328c570c212ea5a95132b16"

RPROVIDES:${PN} += "dlt-viewer \
libdltdbusplugin.so \
libdltlogstorageplugin.so \
libdltsystemviewerplugin.so \
libdlttestrobotplugin.so \
libdltviewerplugin.so \
libfiletransferplugin.so \
libnonverboseplugin.so \
libqdlt.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5SerialPort.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
