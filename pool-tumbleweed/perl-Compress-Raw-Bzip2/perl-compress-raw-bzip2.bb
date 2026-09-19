SUMMARY = "Low-Level Interface to bzip2 compression library"
DESCRIPTION = "'Compress::Raw::Bzip2' provides an interface to the in-memory \
compression/uncompression functions from the bzip2 compression library. \
 \
Although the primary purpose for the existence of 'Compress::Raw::Bzip2' is \
for use by the 'IO::Compress::Bzip2' and 'IO::Compress::Bunzip2' modules, \
it can be used on its own for simple compression/uncompression tasks."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & BSD-3-Clause"

PV = "2.224"

RPM_NAME = "perl-Compress-Raw-Bzip2-2.224-1.1.aarch64.rpm"
RPM_HASH = "cec0415651b8b99a4933d6be3f3367bbc50511fb8e235ff4e9a3d9f610637cef77eaa4c46da8fc5f96406e7e0622f0a22c3758a8576c6c9f3e390c82be467caf"

RPROVIDES:${PN} += "perl-Compress--Raw--Bzip2 \
perl-Compress-Raw-Bzip2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
