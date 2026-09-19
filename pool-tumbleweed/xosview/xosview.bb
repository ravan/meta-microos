SUMMARY = "System Load Information"
DESCRIPTION = "A small program which is mostly configurable using resources via \
~/.Xresources. It shows actual CPU, swap, memory, active interrupts, \
and, if desired, netpacket statistics in a graphical manner."
LICENSE = "GPL-2.0-or-later"

PV = "1.24"

RPM_NAME = "xosview-1.24-4.10.aarch64.rpm"
RPM_HASH = "a46796b84a57cbf2b7f4c62c871e5f7f65bb08c3181dda799f86119d7c6b85d9ef6700920fb72c99f2aa55a49782e8de99a3b2fe76d624f418ebf892ff2914f8"

RPROVIDES:${PN} += "config-xosview \
xosview"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXpm.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
sed \
xrdb"

inherit rpm
