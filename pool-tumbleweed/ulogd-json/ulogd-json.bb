SUMMARY = "JSON output target for ulogd"
DESCRIPTION = "JSON output target for ulogd."
LICENSE = "GPL-2.0-only"

PV = "2.0.9"

RPM_NAME = "ulogd-json-2.0.9-1.6.aarch64.rpm"
RPM_HASH = "7c85010e2b69b459cbb723c8d07d455a6aed04e19a02be3e4d347be6a6bc8e6647b50a56d6d9fdd04be18e8a66adf460ce7b2dc54a620bf3c89e307f77615fcc"

RPROVIDES:${PN} += "ulogd-json"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjansson.so.4 \
ulogd"

inherit rpm
