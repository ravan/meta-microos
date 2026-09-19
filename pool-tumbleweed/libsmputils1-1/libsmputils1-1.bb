SUMMARY = "Library for SAS SMP control of expanders"
DESCRIPTION = "The smp_utils package contains utilities for the Serial Attached SCSI \
(SAS) Management Protocol (SMP). \
 \
This subpackage holds the library of shared functions."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.99"

RPM_NAME = "libsmputils1-1-0.99-2.20.aarch64.rpm"
RPM_HASH = "29aff0dc0450fd275131d0189cfb114ead55807d40f5241b048c56a3b0ed2edb5810ea464c131fd855f6cf06588c559ff701bb41794573d46239da0e3c371cdf"

RPROVIDES:${PN} += "libsmputils1-1 \
libsmputils1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
