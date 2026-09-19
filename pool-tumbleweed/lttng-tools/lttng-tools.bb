SUMMARY = "Linux Trace Toolkit Next Generation userspace tools"
DESCRIPTION = "This package provides the userspace tools for controlling the LTTng \
subsystem from userspace."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.14.0"

RPM_NAME = "lttng-tools-2.14.0-1.4.aarch64.rpm"
RPM_HASH = "089cb8e96ad1d31733eaa80b16c32aad1fe9d002c3c27443acdb2d090c06b01c395a7802f01939bb3e26b89d106ca80e1ce9bcdb6ddbe8cf4cee61f65fbdc014"

RPROVIDES:${PN} += "lttng-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblttng-ctl.so.6 \
liblttng-ust-common.so.1 \
liblttng-ust-ctl.so.6 \
libpopt.so.0 \
libstdc++.so.6 \
liburcu-cds.so.8 \
liburcu-common.so.8 \
liburcu.so.8 \
libxml2.so.16"

inherit rpm
