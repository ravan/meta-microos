SUMMARY = "A tool for statically checking C programs"
DESCRIPTION = "With minimal effort, LCLint can be used as a better lint.  If additional \
effort is invested adding annotations to programs, LCLint can perform \
stronger checks than can be done by any standard lint."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.2"

RPM_NAME = "splint-3.1.2-104.3.aarch64.rpm"
RPM_HASH = "404d98e944788e1ecf9edc82c11cc1fef7cab49f5aabfed9e12da629a8393500fd047be90840fd2413e75746738eb0a38b2847a9d9047b41991d179a72e5c1dd"

RPROVIDES:${PN} += "splint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfl.so.2"

inherit rpm
