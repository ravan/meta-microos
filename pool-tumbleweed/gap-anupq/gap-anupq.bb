SUMMARY = "GAP: Support for p-quotients and p-groups"
DESCRIPTION = "The ANUPQ package is a GAP4 interface to the ANU pq C program, which \
provides access to implementations of the following algorithms: \
 \
* A p-quotient algorithm to compute a power-commutator presentation \
  for a group of prime power order. \
* A p-group generation algorithm to generate descriptions of groups \
  of prime power order. \
* A standard presentation algorithm used to compute a canonical \
  power-commutator presentation of a p-group. \
* An algorithm which can be used to compute the automorphism group of \
  a p-group."
LICENSE = "Artistic-2.0"

PV = "3.3.3"

RPM_NAME = "gap-anupq-3.3.3-1.3.aarch64.rpm"
RPM_HASH = "6fe735b69618f2aed017d247e08f9332748ae03245db78df3f4dcbaa6dde12b1067c9590529ccd07e8cf8df4eb482b8b2553709178012aaa02bab9cacce7f5fc"

RPROVIDES:${PN} += "gap-anupq"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
gap-autpgrp \
gap-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
