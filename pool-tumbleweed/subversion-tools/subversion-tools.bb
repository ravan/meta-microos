SUMMARY = "Tools for Subversion"
DESCRIPTION = "This package contains some tools for subversion server and \
repository admins."
LICENSE = "Apache-2.0"

PV = "1.14.5"

RPM_NAME = "subversion-tools-1.14.5-5.3.aarch64.rpm"
RPM_HASH = "f99923c4c48343e843f15a0cd75b52e6d1f4f64d08bc5b531ea9d39bedb0d28c473b20919d1524be24c1bb58281cb50270450240952b7401aed928c8ccb12a6f"

RPROVIDES:${PN} += "subversion-tools"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libc.so.6 \
libsvn-client-1.so.0 \
libsvn-delta-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-ra-1.so.0 \
libsvn-repos-1.so.0 \
libsvn-subr-1.so.0 \
libsvn-wc-1.so.0"

inherit rpm
