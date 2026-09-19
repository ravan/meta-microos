SUMMARY = "Disk Performance Plugin for the Xfce Panel"
DESCRIPTION = "The DiskPerf plugin displays the disk/partition performance as trasferred data \
per second."
LICENSE = "BSD-2-Clause"

PV = "2.8.0"

RPM_NAME = "xfce4-diskperf-plugin-2.8.0-1.4.aarch64.rpm"
RPM_HASH = "034a289bb1a403c323fb572d5c0cbc48a850d5a18810bb720c818dc57010e5ef4573325e712c87eba40bcd8642c0a26e85603eb627fc50fae9961fdb62547516"

RPROVIDES:${PN} += "libdiskperf.so \
xfce4-diskperf-plugin \
xfce4-panel-plugin-diskperf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
