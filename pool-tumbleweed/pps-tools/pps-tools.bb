SUMMARY = "Userspace tools for the Linux Pulse Per Second subsystem"
DESCRIPTION = "Userland tools to test Linux kernel PPS API. See Documentations/pps/pps.txt \
for reference."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3+git20240314"

RPM_NAME = "pps-tools-1.0.3+git20240314-1.8.aarch64.rpm"
RPM_HASH = "0b4b8befb007f9dd5a135450a72f27e220be50cd72279a10ca5d66b81c0ff683196451dc339054ccd8e9c862d799ecaffe4edcad7f2f3809d3703788ff5ac4a4"

RPROVIDES:${PN} += "pps-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
pps-udev"

inherit rpm
