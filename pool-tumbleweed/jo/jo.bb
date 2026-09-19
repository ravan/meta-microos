SUMMARY = "JSON output from a shell"
DESCRIPTION = "This is jo, a small utility to create JSON objects"
LICENSE = "GPL-2.0-or-later & MIT"

PV = "1.9"

RPM_NAME = "jo-1.9-1.12.aarch64.rpm"
RPM_HASH = "7a9068d5d573b67f7aed4811b69ce5a2da23be2e24eb75f8e959916e07223d4d35d78d9c8d3976e76226560a2f4f00104b0ad7af76bb452ff61d075d09c0ebdb"

RPROVIDES:${PN} += "jo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
