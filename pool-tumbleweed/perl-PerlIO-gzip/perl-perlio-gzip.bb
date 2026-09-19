SUMMARY = "Perl extension to provide a PerlIO layer to gzip/gunzip"
DESCRIPTION = "PerlIO::gzip provides a PerlIO layer that manipulates files in the format \
used by the 'gzip' program. Compression and Decompression are implemented, \
but not together. If you attempt to open a file for reading and writing the \
open will fail."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.20"

RPM_NAME = "perl-PerlIO-gzip-0.20-1.41.aarch64.rpm"
RPM_HASH = "1240538944b3fa6a753405e2c3cb755156c18c4999b374dbecd08d2003bf08a6de671f0dcda3c75188db74c964b38a8bc5324f132a8ac192b8c9ce37529b293a"

RPROVIDES:${PN} += "perl-PerlIO--gzip \
perl-PerlIO-gzip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
