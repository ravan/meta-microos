SUMMARY = "Block compression/decompression utility from the HTSlib project"
DESCRIPTION = "HTSlib is an implementation of a unified C library for accessing common file formats, such as \
SAM, CRAM and VCF, used for high-throughput sequencing data, and is the core library used by \
samtools and bcftools. \
HTSlib implements a generalized BAM index, with file extension .csi (coordinate-sorted index). \
The HTSlib file reader first looks for the new index and then for the old if the new index is absent. \
This project also includes the popular tabix indexer, which indexes both .tbi and .csi formats, and \
the bgzip compression utility."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "bgzip-1.21-1.6.aarch64.rpm"
RPM_HASH = "cb3e5cdac25960b188f298cd4c8f4cf51f2470b765750626e8a32e2e8c6c3b81ecfdc38aeadf6cd10a6839162c87294f0924f09598f57d7b52c4aa3ae3a99f5c"

RPROVIDES:${PN} += "bgzip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libhts3 \
libhtscodecs.so.2 \
liblzma.so.5 \
libz.so.1 \
tabix"

inherit rpm
