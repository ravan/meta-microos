SUMMARY = "Headers for building against zchunk"
DESCRIPTION = "zchunk is a compressed file format that splits the file into independent \
chunks.  This allows you to only download the differences when downloading a \
new version of the file, and also makes zchunk files efficient over rsync. \
zchunk files are protected with strong checksums to verify that the file you \
downloaded is in fact the file you wanted. \
 \
This package contains the headers necessary for building against the zchunk \
library, libzck."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.5.4"

RPM_NAME = "libzck-devel-1.5.4-1.1.aarch64.rpm"
RPM_HASH = "01a840aeb2f50b407a317c659e4b21240d857c997e3382207e8129ae369844b3b5313823de9d7cedd302350bb242a19129ac258ec497c6d93004826a07d2e648"

RPROVIDES:${PN} += "libzck-devel \
pkgconfig-zck \
zchunk-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzck1 \
pkgconfig-libzstd \
pkgconfig-openssl"

inherit rpm
