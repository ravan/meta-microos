SUMMARY = "Binary Decision Diagram manipulation library"
DESCRIPTION = "CUDD is a package for the manipulation of Binary Decision Diagrams \
(BDDs), Algebraic Decision Diagrams (ADDs) and Zero-suppressed Binary \
Decision Diagrams (ZDDs)."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "libcudd-3_0_0-0-3.0.0-3.25.aarch64.rpm"
RPM_HASH = "b9a41814e39c0def5878f795e52cb7a394abaa85f80c42f64ad9f5358ade074c55462ad95e1de6c812d8651040708ee44dc659030d7fbda327e731f062332e6c"

RPROVIDES:${PN} += "libcudd-3-0-0-0 \
libcudd-3.0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
