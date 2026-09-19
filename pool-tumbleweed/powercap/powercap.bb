SUMMARY = "Tools for the Linux Power Capping Framework"
DESCRIPTION = "This project provides the powercap library -- a generic C interface to the \
Linux power capping framework (sysfs interface). It includes an implementation \
for working with Intel Running Average Power Limit (RAPL). \
 \
It also provides the following applications: \
 \
powercap-info - view powercap control type hierarchies or zone/constraint-specific configurations \
powercap-set - set powercap control type zone/constraint-specific configurations"
LICENSE = "GPL-2.0-only"

PV = "0.6.0"

RPM_NAME = "powercap-0.6.0-1.15.aarch64.rpm"
RPM_HASH = "268c4276a46d7f8e066d059916a9ad81a613def86870e1aa65031f410d3c4b9613f9fa16de7892e0174fbe343acb417da62acc0ce45525afc95d6b8df43aaaa2"

RPROVIDES:${PN} += "libpowercap.so.0 \
powercap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
