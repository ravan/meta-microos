SUMMARY = "Development libraries for BLACS (mvapich2)"
DESCRIPTION = "This package contains development libraries for BLACS, compiled against mvapich2."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2.2.2"

RPM_NAME = "libblacs2-mvapich2-devel-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "e3689db0997ef230b867d1fac8f41b50f451c60e18991d0da769b454567b241334001744c8a2696f5036b737f27b677c91b94b2a20b407c09452aef6d4afb4f0"

RPROVIDES:${PN} += "blacs-mvapich2-devel \
libblacs.so.2.2.2 \
libblacs2-mvapich2-devel"

RDEPENDS:${PN} += "blacs-devel-headers \
ld-linux-aarch64.so.1 \
libblacs2-mvapich2 \
libc.so.6 \
libmpi.so.12 \
mvapich2-devel"

inherit rpm
