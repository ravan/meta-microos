SUMMARY = "Library for MacOS data types"
DESCRIPTION = "libfmos is a library for MacOS data types."
LICENSE = "LGPL-3.0-or-later"

PV = "20260520"

RPM_NAME = "libfmos1-20260520-1.8.aarch64.rpm"
RPM_HASH = "a414dae766231fd85ca94402bd3680f2023e4456bbca357640cbee2d616cc89747cb9836ad856015f4e3fb34c7d9611886184507020f2d0b4f2df6f1edbee713"

RPROVIDES:${PN} += "libfmos.so.1 \
libfmos1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcnotify.so.1"

inherit rpm
