SUMMARY = "Tests for the package"
DESCRIPTION = "Upstream testsuite for the package"
LICENSE = "GPL-3.0-or-later"

PV = "1.35"

RPM_NAME = "tar-tests-1.35-10.1.aarch64.rpm"
RPM_HASH = "6f87a580389d17b7887a05a71d864f11358f032ece0c8f4e34b79b8708459785c97e3d4200e30cf17340a72b255fad79dcd89a6fc443e8a5a3836dbcddde172d"

RPROVIDES:${PN} += "tar-tests"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
tar"

inherit rpm
