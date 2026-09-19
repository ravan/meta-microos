SUMMARY = "Performance Application Programming Interface"
DESCRIPTION = " \
PAPI aims to provide the tool designer and application engineer with a \
consistent interface and methodology for use of the performance counter \
hardware found in most major microprocessors. PAPI enables software \
engineers to see, in near real time, the relation between software \
performance and processor events."
LICENSE = "BSD-3-Clause"

PV = "7.2.0"

RPM_NAME = "papi-7.2.0-1.6.aarch64.rpm"
RPM_HASH = "6ca1f0209125ae293933656e44e1be16608a6dd9f608f2e62bb3391be91c49bcfcb8a765765e95e3eb5264fe29da24e2866a41d72e96709be429ef7aac416d00"

RPROVIDES:${PN} += "papi"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
