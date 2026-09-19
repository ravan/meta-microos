SUMMARY = "C library for high-throughput sequencing data formats"
DESCRIPTION = "HTSlib is an implementation of a unified C library for accessing common file formats, such as \
SAM, CRAM and VCF, used for high-throughput sequencing data, and is the core library used by \
samtools and bcftools. \
HTSlib implements a generalized BAM index, with file extension .csi (coordinate-sorted index). \
The HTSlib file reader first looks for the new index and then for the old if the new index is absent."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "libhts3-1.21-1.6.aarch64.rpm"
RPM_HASH = "0a707f011be406b48bf8759b32fc9ff0613e32b33e071c4b399e6f46b53a5cbffb256dae42153e614c25f4c759e37c46a7e746331ae0cad73864f5e7e391a75e"

RPROVIDES:${PN} += "libhts.so.3 \
libhts3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libhtscodecs.so.2 \
libhtscodecs2 \
liblzma.so.5 \
libm.so.6 \
libz.so.1"

inherit rpm
