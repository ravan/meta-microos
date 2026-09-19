SUMMARY = "Utilities for Amazon S3 service"
DESCRIPTION = "A command-line frontend for Amazon S3 access."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "4.1.git277"

RPM_NAME = "libs3-tools-4.1.git277-1.27.aarch64.rpm"
RPM_HASH = "f53ca155497922a5609b43c680dee63595c273694cb0a3314eaf194e31b7901eb97788f37f79995ff79cb33f55d2c04784845275218c7aeb0fadf6364c8ff27b"

RPROVIDES:${PN} += "libs3-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libs3.so.4"

inherit rpm
