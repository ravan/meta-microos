SUMMARY = "Linux Trace Toolkit Next Generation control and utility library"
DESCRIPTION = "This package provides a userspace library for controlling the LTTng \
subsystem. It is primarily intended for use by the lttng-tools \
package."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.14.0"

RPM_NAME = "liblttng-ctl6-2.14.0-1.4.aarch64.rpm"
RPM_HASH = "52fca6c2b46d62b8bdfebba0324c952e17da4433e12584765f8a3d8458792cc6d5f6b41a1860dd6b676999f8f840fa0e8c845ab485312cda595b28847867a1ea"

RPROVIDES:${PN} += "liblttng-ctl.so.6 \
liblttng-ctl6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
