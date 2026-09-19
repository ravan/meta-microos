SUMMARY = "Multi-purpose desktop calculator application"
DESCRIPTION = "Qalculate is a multi-purpose desktop calculator. Features include \
customizable functions, units, arbitrary precision, plotting, and a \
graphical interface that uses a one-line fault-tolerant expression \
entry (although it supports optional traditional buttons). \
This is the commandline interface, named qalc."
LICENSE = "GPL-2.0-or-later"

PV = "5.12.0"

RPM_NAME = "qalculate-5.12.0-1.1.aarch64.rpm"
RPM_HASH = "edd09d665968bfcf99e7f59b153964351c0afa8fb853813a4a3605d1780e192972d07571e1591fed626f5c688bc2948c6acdb4439cce17568676192d562e6247"

RPROVIDES:${PN} += "qalculate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqalculate.so.23 \
libreadline.so.8 \
libstdc++.so.6 \
qalculate-data"

inherit rpm
