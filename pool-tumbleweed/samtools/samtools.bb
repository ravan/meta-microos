SUMMARY = "Tools for manipulating next-generation sequencing data"
DESCRIPTION = "Samtools implements various utilities for post-processing alignments in the \
SAM, BAM, and CRAM formats, including indexing, variant calling (in conjunction \
with bcftools), and a simple alignment viewer."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "samtools-1.21-2.1.aarch64.rpm"
RPM_HASH = "a228905116ad9cb3f97f3b247c7e22117dc957911bf234bc8e6b984576e9429a69d06f166078f3130187a58dfcf553108c4e8947f388e74d69845a430fb5ea03"

RPROVIDES:${PN} += "samtools"

RDEPENDS:${PN} += "/usr/bin/perl \
bgzip \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhts.so.3 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
libz.so.1 \
perl-base \
tabix"

inherit rpm
