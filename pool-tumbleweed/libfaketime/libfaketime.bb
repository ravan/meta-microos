SUMMARY = "FakeTime Preload Library"
DESCRIPTION = "Report faked system time to programs without having to change the system-wide time."
LICENSE = "GPL-2.0-only"

PV = "0.9.12"

RPM_NAME = "libfaketime-0.9.12-2.3.aarch64.rpm"
RPM_HASH = "98dc353b40a7f4bcbffee39c688a5357b68913dc50cd5cabcfe629fa887115d95e48afbb3f76cb2721ecec54509167ed98887e69a8cb8e856c7a024dcc7f1c6d"

RPROVIDES:${PN} += "libfaketime \
libfaketime.so.1 \
libfaketimeMT.so.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
