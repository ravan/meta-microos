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

RPM_NAME = "libblacs2-openmpi5-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "c908ae58073075fe66f30f4519c952e14675bc6d3a053860f1b06b7ac374615c76455f8a2c97097174d823ececc3876713a8ec3b18a8bf6581281eba3eec1e06"

RPROVIDES:${PN} += "libblacs.so.2.2.2 \
libblacs2-openmpi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.40"

inherit rpm
