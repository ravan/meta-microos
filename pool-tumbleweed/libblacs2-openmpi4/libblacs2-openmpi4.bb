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

RPM_NAME = "libblacs2-openmpi4-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "3c6a91009de25d3708be095a3c7f82f15dda81d428948535b3002a17e748d8621bfaf2257903d961c7d0e4a1e9f02d053709ae1acf65e294c371b2eb69a03db9"

RPROVIDES:${PN} += "libblacs.so.2.2.2 \
libblacs2-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.40"

inherit rpm
