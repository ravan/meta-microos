SUMMARY = "GAP package for computing with error-correcting codes"
DESCRIPTION = "GUAVA is a package that implements coding theory algorithms in GAP. \
With GUAVA, codes can be created and manipulated and information \
about codes can be calculated. \
 \
GUAVA consists of various files written in the GAP language, and an \
external program for dealing with automorphism groups of codes and \
isomorphism testing functions. Several algorithms that need the speed \
are integrated in the GAP kernel."
LICENSE = "GPL-2.0-or-later"

PV = "3.21"

RPM_NAME = "gap-guava-3.21-1.3.aarch64.rpm"
RPM_HASH = "ff1c23d426c4bc6b653519cc7d542724a8d7f21e8717e0e88e6701d33c4d9096555cf0b1713ef8b6878d5e2a29ee8cadc264e34df34a4fdb05a047798b3496d5"

RPROVIDES:${PN} += "gap-guava"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-sonata \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
