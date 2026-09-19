SUMMARY = "Zchunk library"
DESCRIPTION = "zchunk is a compressed file format that splits the file into independent \
chunks.  This allows you to only download the differences when downloading a \
new version of the file, and also makes zchunk files efficient over rsync. \
zchunk files are protected with strong checksums to verify that the file you \
downloaded is in fact the file you wanted. \
 \
This package contains the zchunk library, libzck."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.5.4"

RPM_NAME = "libzck1-1.5.4-1.1.aarch64.rpm"
RPM_HASH = "e1e4502d48592ab6e359b3cf95ab7445a7036c45901912df420c35aa47ba05d2edbcb84492f40acf434cefb291caacd23b3c8bd57ee86cdf764ad68bd3c67adb"

RPROVIDES:${PN} += "libzck.so.1 \
libzck1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libzstd.so.1"

inherit rpm
