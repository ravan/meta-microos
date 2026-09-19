SUMMARY = "Utilities for video4linux"
DESCRIPTION = "v4l-utils is a collection of various video4linux (V4L) utilities."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.32.0"

RPM_NAME = "v4l-utils-1.32.0-2.4.aarch64.rpm"
RPM_HASH = "4a149cde8ede86c127c91e02df69e8138467dc0a1326a8f79c9e85a38671473211525cb449e7d623eb42d31a71c8d7c3b5134d24ba672be554275f9883c50032"

RPROVIDES:${PN} += "config-v4l-utils \
v4l-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libudev.so.1 \
libv4l \
libv4l2.so.0 \
libv4l2rds.so.0"

inherit rpm
