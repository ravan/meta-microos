SUMMARY = "Libraries for udunits2"
DESCRIPTION = "This package contains the runtime libraries for udunits2."
LICENSE = "MIT"

PV = "2.2.28"

RPM_NAME = "libudunits2-0-2.2.28-2.8.aarch64.rpm"
RPM_HASH = "a1c242e0b53685ff0422c82c1a09a79c2baef018a8600730ae94e2592fc704fcf563324de05e5a8d8944fa9a66a728406ecd933ae249427c0e324701a2583560"

RPROVIDES:${PN} += "libudunits2-0 \
libudunits2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libm.so.6"

inherit rpm
