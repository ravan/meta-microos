SUMMARY = "Igusa (genus 2) class polynomial computation"
DESCRIPTION = "This software package computes Igusa (genus 2) class polynomials, \
which parameterise the CM points in the moduli space of 2-dimensional \
abelian varieties, i.e. Jacobians of hyperelliptic curves. \
 \
This program is also able to compute theta constants at arbitrary \
precision."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.1"

RPM_NAME = "cmh-1.1.1-1.16.aarch64.rpm"
RPM_HASH = "b69afcfe745e9c884084eadb74042779334bfb3181acf084be99d9efc2c59ac51fd2e221c16b3cdfd407943b447fe772a5292251652a7713d2480a71f56cee7e"

RPROVIDES:${PN} += "cmh \
libparsepari.so.0"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcmh.so.0 \
libfplll.so.9 \
libgcc-s.so.1 \
libgmp.so.10 \
libmpc.so.3 \
libmpfr.so.6 \
libmpfrcx.so.1 \
libpari-gmp-tls.so.9 \
libstdc++.so.6"

inherit rpm
