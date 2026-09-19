SUMMARY = "Test suite for libqb"
DESCRIPTION = "The libqb-tests package contains the libqb test suite."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.9+20250916.4b496d0"

RPM_NAME = "libqb-tests-2.0.9+20250916.4b496d0-1.5.aarch64.rpm"
RPM_HASH = "bbac6824c4b0df1b8d479827daabac8b77396f7b4f48b3378d814d2a050b0b926544554e075411038c7cd94338fba0619d133aaad1e3660a2140aa1669a226e3"

RPROVIDES:${PN} += "libqb-tests"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcheck.so.0 \
libqb.so.100"

inherit rpm
