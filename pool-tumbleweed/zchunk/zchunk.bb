SUMMARY = "Compressed file format that allows easy deltas"
DESCRIPTION = "zchunk is a compressed file format that splits the file into independent \
chunks.  This allows you to only download the differences when downloading a \
new version of the file, and also makes zchunk files efficient over rsync. \
zchunk files are protected with strong checksums to verify that the file you \
downloaded is in fact the file you wanted."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.5.4"

RPM_NAME = "zchunk-1.5.4-1.1.aarch64.rpm"
RPM_HASH = "e98f13730f86c8c2af33f1114b0ae99b8480360b2cf489b468f33b19b00e2294cc72c3618aec42ca163e12d76e8fc6ebe547ffa1094a55c912cd307f1f4e60b8"

RPROVIDES:${PN} += "bundled-buzhash-urlblock \
zchunk"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libzck.so.1 \
libzck1"

inherit rpm
