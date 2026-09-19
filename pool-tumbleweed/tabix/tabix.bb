SUMMARY = "Generic indexer for TAB-delimited genome position files from the HTSlib project"
DESCRIPTION = "HTSlib is an implementation of a unified C library for accessing common file formats, such as \
SAM, CRAM and VCF, used for high-throughput sequencing data, and is the core library used by \
samtools and bcftools. \
HTSlib implements a generalized BAM index, with file extension .csi (coordinate-sorted index). \
The HTSlib file reader first looks for the new index and then for the old if the new index is absent. \
This project also includes the popular tabix indexer, which indexes both .tbi and .csi formats, and \
the bgzip compression utility."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "tabix-1.21-1.6.aarch64.rpm"
RPM_HASH = "0bf9ff1c967c874b754bebcf25c78587f8ab1af21c64e9758d48bfe9eb3ba9a623044c83b6142f20be55971a2d04dd3c4c500a1ecf79740c68e7930036619f1d"

RPROVIDES:${PN} += "tabix"

RDEPENDS:${PN} += "bgzip \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libhts3 \
libhtscodecs.so.2 \
liblzma.so.5 \
libm.so.6 \
libz.so.1"

inherit rpm
