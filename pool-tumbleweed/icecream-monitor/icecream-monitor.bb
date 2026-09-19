SUMMARY = "Monitor Program for the icecream Compile Farm"
DESCRIPTION = "icecream is the next generation distcc. This package provides a monitor \
program."
LICENSE = "GPL-2.0-or-later"

PV = "3.3"

RPM_NAME = "icecream-monitor-3.3-1.34.aarch64.rpm"
RPM_HASH = "4240df9edbdc6298a2448724b3a75417b888d9082049af3eb7c5e2d9e3c0c0aa6d1a7860de869a6c2930d70683cf40b88e3e857491c60e479e55e0845ff47f21"

RPROVIDES:${PN} += "icecream-monitor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcap-ng.so.0 \
libgcc-s.so.1 \
liblzo2.so.2 \
libm.so.6 \
libstdc++.so.6 \
libzstd.so.1"

inherit rpm
