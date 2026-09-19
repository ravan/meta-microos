SUMMARY = "Utilities from the libzip project"
DESCRIPTION = "This subpackage contains zipcmp and zipmerge, for comparison of two \
archives, and merging multiple archives together, respectively."
LICENSE = "BSD-3-Clause"

PV = "1.11.4"

RPM_NAME = "libzip-tools-1.11.4-1.5.aarch64.rpm"
RPM_HASH = "9a4ae98fe13bb5a6df73d1f84169cbc64765dc41d5d8d41d130faa4ef7726abcc08776a6dc4e6a6b2556a76feb90d66e0482a2c3096e0bfc778097fec0e97322"

RPROVIDES:${PN} += "libzip \
libzip-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzip.so.5"

inherit rpm
