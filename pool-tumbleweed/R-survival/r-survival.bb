SUMMARY = "Package provides recommended R-survival"
DESCRIPTION = "This packages provides R-survival, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.8.6"

RPM_NAME = "R-survival-3.8.6-58.3.aarch64.rpm"
RPM_HASH = "d9fcda2a080b52e318858628a20a8e7efdf75c7fc7ad2f8af67586661747a84d7a0eacf47cba7122a5267f50d2224a8fbdabdb9facfeb62308c1c3c4011122c2"

RPROVIDES:${PN} += "R-survival"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
