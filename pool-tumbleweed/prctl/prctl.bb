SUMMARY = "A utility to perform process operations"
DESCRIPTION = "The prctl utility allows a user to control certain process behaviors in \
the runtime environment."
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "prctl-1.7-1.8.aarch64.rpm"
RPM_HASH = "e319e1fe135e8631cc671e35db9c1d34c53373f22fe4c04e31bfb5d24fbadd477e802ec3a94c0a9d2a6edc6f4e077ac05fcb2f3325fbfa297f8df5e72b1e2d24"

RPROVIDES:${PN} += "prctl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
