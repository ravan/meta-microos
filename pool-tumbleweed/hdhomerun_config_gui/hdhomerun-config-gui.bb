SUMMARY = "HDHomeRun GTK GUI"
DESCRIPTION = "The HDHomeRun Config GUI is a GUI tool to discover, configure, and scan \
HDHomeRun TV tuners. The tool can also be used to update the tuner's firmware. \
 \
Firmware updates can be downloaded from http://www.silicondust.com/support/hdhomerun/downloads/linux"
LICENSE = "GPL-3.0-only"

PV = "20190621"

RPM_NAME = "hdhomerun_config_gui-20190621-2.11.aarch64.rpm"
RPM_HASH = "06cebcd5b3abc47383b1bcd70595b48f06e5688c13144861a61e6e3ec6f5ff16bdd4a8788b8d426e6941959b21464f71d8ffef4dfbcbc8c80984ad0be9ec1da2"

RPROVIDES:${PN} += "hdhomerun-config-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libhdhomerun.so.2 \
libhdhomerun2 \
libstdc++.so.6"

inherit rpm
