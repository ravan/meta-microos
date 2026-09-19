SUMMARY = "Development files for nauty, a math library"
DESCRIPTION = "nauty and Traces are programs for computing automorphism groups of \
graphs and digraphs. They can also produce a canonical label. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libnauty."
LICENSE = "Apache-2.0"

PV = "2.9.3"

RPM_NAME = "nauty-devel-2.9.3-1.5.aarch64.rpm"
RPM_HASH = "2995a08a296e84aa6fdcf19b95b6840fc28a461a8590f71a6181f2535d205430393b16d28a8583b098039fc10e3d5774500e5958d2a655e560cab11158811f73"

RPROVIDES:${PN} += "nauty-devel"

RDEPENDS:${PN} += "libnauty-2-9-3"

inherit rpm
