SUMMARY = "Tools for manipulating variant calls in the Variant Call Format (VCF)"
DESCRIPTION = "Package for the new BCFtools: a set of utilities that manipulate variant calls in the Variant Call Format (VCF) \
and its binary counterpart BCF. It contains all the 'vcf...' commands which previously lived in the HTSlib \
repository (such as vcfcheck, vcfmerge, vcfisec, etc.) and the samtools BCF calling from bcftools subdirectory \
of samtools. BCFtools are meant as a faster replacement for most of the perl VCFtools commands."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "bcftools-1.21-1.6.aarch64.rpm"
RPM_HASH = "65bee41ed65cd1ce2f3b4722137090b84a3b2ca3ba48a57704fa5203ee320f34ffc44c84993e46c5345b2db4934e4a8ad40b21a5da95984353305dd3e9816635"

RPROVIDES:${PN} += "bcftools"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
bgzip \
htsfile \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhts.so.3 \
libm.so.6 \
perl-base \
python3-base \
python3-matplotlib \
tabix"

inherit rpm
