SUMMARY = "Identify high-throughput sequencing data files from the HTSlib project"
DESCRIPTION = "HTSlib is an implementation of a unified C library for accessing common file formats, such as \
SAM, CRAM and VCF, used for high-throughput sequencing data, and is the core library used by \
samtools and bcftools. \
HTSlib implements a generalized BAM index, with file extension .csi (coordinate-sorted index). \
The HTSlib file reader first looks for the new index and then for the old if the new index is absent. \
This project also includes the popular tabix indexer, which indexes both .tbi and .csi formats, and \
the bgzip compression utility."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "htsfile-1.21-1.6.aarch64.rpm"
RPM_HASH = "573653bffda5adeea11316de020663e49cf2183e11d526a6cd89f658b8ede1c757f13b305aa28eeb32c29e4693c1e80b52dee8b147bd20f4572bc752f163b321"

RPROVIDES:${PN} += "htsfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
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
