SUMMARY = "Basic Linear Algebra Communication Subprograms"
DESCRIPTION = "The BLACS (Basic Linear Algebra Communication Subprograms) project \
provides a linear algebra oriented message passing interface for \
a large range of distributed memory platforms. \
 \
The length of time required to implement efficient distributed memory \
algorithms makes it impractical to rewrite programs for every new \
parallel machine. The BLACS exist in order to make linear algebra \
applications both easier to program and more portable."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2.2.2"

RPM_NAME = "libblacs2-mvapich2-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "ce33f1b5de5e3eb4cb9b06ae5b633c1636be2143e332312cb23dea8adb4cb78a26f6707f522d283a63e85c1fe17c9dd70ca386f9c1916215f1ae0b8b1bdde2da"

RPROVIDES:${PN} += "libblacs.so.2.2.2 \
libblacs2-mvapich2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.12"

inherit rpm
