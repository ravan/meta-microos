SUMMARY = "Example applications for OpenAMP"
DESCRIPTION = "This package contains example binaries for OpenAMP."
LICENSE = "BSD-3-Clause"

PV = "2020.01"

RPM_NAME = "openamp-examples-2020.01-2.9.aarch64.rpm"
RPM_HASH = "cfb358808b86bfdef39fe3d9fd674a808312b15f0a0754d2d17ac49cf2c12f818d39fd7b8b7d354d57197ba9d94bd54e72c607d1448bad56949e220e884b6ba6"

RPROVIDES:${PN} += "openamp-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmetal.so.1 \
libopen-amp.so.0 \
libopen-amp0"

inherit rpm
