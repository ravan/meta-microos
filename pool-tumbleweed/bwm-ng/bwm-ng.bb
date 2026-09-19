SUMMARY = "Realtime Bandwidth Monitor"
DESCRIPTION = "Bandwidth Monitor NG is a console-based live bandwidth monitor. \
 \
- supports /proc/net/dev, netstat, getifaddr, sysctl, kstat and libstatgrab \
- unlimited number of interfaces supported \
- interfaces are added or removed dynamically from list \
- white-/blacklist of interfaces \
- output of KB/s, Kb/s, packets, errors, average, max and total sum \
- output in curses, plain console, CSV or HTML \
- configfile"
LICENSE = "GPL-2.0-or-later"

PV = "0.6.3"

RPM_NAME = "bwm-ng-0.6.3-1.21.aarch64.rpm"
RPM_HASH = "80bb8852ec14b799e63747460a9d17021f2232f9d41337a7328244c7d6ec55a6da7b20fa4e08e3e947a19997104853b2d5bb69275b5eca557f1cf4a832d0763f"

RPROVIDES:${PN} += "bwm-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libstatgrab.so.10 \
libtinfo.so.6"

inherit rpm
