SUMMARY = "Sigrok Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to collect measurements from \
various devices supported by libsigrok."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-sigrok-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "abaed77d90f7db91e1bf8a66a45c4d2359409e6c16fb1bcdf879a2bfc2c9f202d4e05ae73b702392362aca5cdef22a38db05f592e27db3975bb8df290d81894b"

RPROVIDES:${PN} += "collectd-plugin-sigrok"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libsigrok.so.4"

inherit rpm
