SUMMARY = "Debug/Test tool to exercise the btrfs out-of-band deduplication ioctl"
DESCRIPTION = "Debug/Test tool to exercise a btrfs ioctl for deduplicating file regions."
LICENSE = "GPL-2.0-only"

PV = "0.15"

RPM_NAME = "btrfs-extent-same-0.15-1.7.aarch64.rpm"
RPM_HASH = "e2ef1a25062984957524689b77e95f5505fd5b3333e48dc4e55a9436ba99c01e338b3e78e11ae371fc8df38a5bfcbb41897eba6058f473f9ff4fef7ebf16dbc2"

RPROVIDES:${PN} += "btrfs-extent-same"

RDEPENDS:${PN} += "libc.so.6 \
libglib-2.0.so.0 \
libsqlite3.so.0"

inherit rpm
