SUMMARY = "CacheFiles userspace management daemon"
DESCRIPTION = "cachefilesd is a user-space management daemon for CacheFiles, a generic \
caching framework for mounted filesystems."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.10"

RPM_NAME = "cachefilesd-0.10.10-4.5.aarch64.rpm"
RPM_HASH = "30119d31d035ec00652c5ea5f9138f0e71fa72fb6aef99c10a1fc3a94fde40888addc22f0c7c383c7246b149d30210409453bb0b2d40db24d13a254dd1e2dfb7"

RPROVIDES:${PN} += "cachefilesd \
config-cachefilesd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
systemd"

inherit rpm
