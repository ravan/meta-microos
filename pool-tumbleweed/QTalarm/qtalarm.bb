SUMMARY = "A handy alarm clock Program written in QT"
DESCRIPTION = "A handy alarm clock Program written in QT. \
Features: \
 * Up to 15 Customization alarms \
 * Can wake up using the default sound, or any of audio / video \
   file of your choosing. \
 * Custom Date alarms"
LICENSE = "GPL-3.0-only"

PV = "3.1.0"

RPM_NAME = "QTalarm-3.1.0-1.1.aarch64.rpm"
RPM_HASH = "894fdf5718fec5597462ee732376eb1d5718562d13f032b0727ef612a0153211b4ed71939a2d3c60ba0c1660ea6b1487131de236c0723fc44bac7e2d6499b34d"

RPROVIDES:${PN} += "QTalarm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
