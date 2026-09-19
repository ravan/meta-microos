SUMMARY = "A Linux Tool to Find out What is Using Power on a Laptop"
DESCRIPTION = "PowerTOP is a program that collects the various pieces of information \
from your system and presents an overview of how well your laptop is \
doing in terms of power savings."
LICENSE = "GPL-2.0-only"

PV = "2.16"

RPM_NAME = "powertop-2.16-2.1.aarch64.rpm"
RPM_HASH = "c863a4feb70722c3569df8566ec2d5dd332a3a262113d2d5af49b557d0a404d4082c745ce46f73c595116edb3e9b8a90d959b00ef9e3f923ac213d13a5904335"

RPROVIDES:${PN} += "powertop"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libncursesw.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libpci.so.3 \
libstdc++.so.6 \
libtinfo.so.6 \
libtraceevent.so.1 \
libtracefs.so.1 \
systemd"

inherit rpm
