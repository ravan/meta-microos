SUMMARY = "Monitoring the International Beacon Project"
DESCRIPTION = "This program continuously shows which beacon of the International Beacon \
Project (on the HF bands from 14 through 28 MHz) is currently transmitting. On \
X11 systems, it can also show a sunclock-like map with the short and long paths \
to the active beacons."
LICENSE = "GPL-2.0-only"

PV = "0.21"

RPM_NAME = "ibp-0.21-2.4.aarch64.rpm"
RPM_HASH = "791813a5a3e31ae10b7bb6d2c568e06d60b0360c7c99a478438adfb383827258f56b958ffc4579d6b45ae2dbb62073cc272db1234df02b166fbf72cce4a0ba19"

RPROVIDES:${PN} += "ibp"

RDEPENDS:${PN} += "libX11.so.6 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
