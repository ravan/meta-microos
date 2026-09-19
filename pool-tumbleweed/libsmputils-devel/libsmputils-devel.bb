SUMMARY = "Development files for the SAS SMP Expander Control Library"
DESCRIPTION = "The smp_utils package contains utilities for the Serial Attached SCSI \
(SAS) Management Protocol (SMP). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libsmputils."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.99"

RPM_NAME = "libsmputils-devel-0.99-2.20.aarch64.rpm"
RPM_HASH = "beabc3cb9672ebbd703ff091f50133a8b7dcddc15472ca46ea9cf9bf64873e1743845d24b1af2fbfa0d0951085b2e9cccf590baac293f937c9a66f7e66f69309"

RPROVIDES:${PN} += "libsmputils-devel"

RDEPENDS:${PN} += "libsmputils1-1"

inherit rpm
