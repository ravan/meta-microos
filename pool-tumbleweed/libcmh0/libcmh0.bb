SUMMARY = "Igusa (genus 2) class polynomial computation library"
DESCRIPTION = "This library package computes Igusa (genus 2) class polynomials, \
which parameterise the CM points in the moduli space of 2-dimensional \
abelian varieties, i.e. Jacobians of hyperelliptic curves. \
 \
It includes libraries that can be called from within a C program. \
This subpackage provides the development headers for CM."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.1"

RPM_NAME = "libcmh0-1.1.1-1.16.aarch64.rpm"
RPM_HASH = "1fb210adf04ca82aaf05ef8caa7e5885c81551baaff5102be8675876c6829e133691b9eb3b1a74be4dbc4379b17684f8c75fdf19b996e3fbb30e9d159af6f67c"

RPROVIDES:${PN} += "libcmh.so.0 \
libcmh0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpc.so.3 \
libmpfr.so.6"

inherit rpm
