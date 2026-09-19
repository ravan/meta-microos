SUMMARY = "Low-Level Perl Interface to lzma compression library"
DESCRIPTION = "'Compress::Raw::Lzma' provides an interface to the in-memory \
compression/uncompression functions from the lzma compression library. \
 \
Although the primary purpose for the existence of 'Compress::Raw::Lzma' is \
for use by the 'IO::Compress::Lzma', 'IO::Uncompress::UnLzma', \
'IO::Compress::Xz' and 'IO::Uncompress::UnXz' modules, it can be used on \
its own for simple compression/uncompression tasks. \
 \
There are two functions, called 'code' and 'flush', used in all the \
compression and uncompression interfaces defined in this module. By default \
both of these functions overwrites any data stored in its output buffer \
parameter. If you want to compress/uncompress to a single buffer, and have \
'code' and 'flush' append to that buffer, enable the 'AppendOutput' option \
when you create the compression/decompression object."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.224.0"

RPM_NAME = "perl-Compress-Raw-Lzma-2.224.0-1.1.aarch64.rpm"
RPM_HASH = "c8ea274695dc6c62fba869c2628e0b7674e4e2612b6f719b9eb1b9f3ca2313ba99c08b9226a968dd9a62376b4ad58ac20f807aca9898ab122cc15d21a345633e"

RPROVIDES:${PN} += "perl-Compress--Raw--Lzma \
perl-Compress-Raw-Lzma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
