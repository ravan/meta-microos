SUMMARY = "Library for heuristic file type identification"
DESCRIPTION = "This library reads magic files and detects file types. Used by file command"
LICENSE = "BSD-2-Clause"

PV = "5.48"

RPM_NAME = "libmagic1-5.48-2.2.aarch64.rpm"
RPM_HASH = "c765316ef4dd21e98eb2b993b38bd3058d7f1e6dc9728b31beb838e181cb53083e10da931ed807335acedd332edd162d2b8eb4b650b0d9718973ba0eed41d9eb"

RPROVIDES:${PN} += "file-/usr/lib64/libmagic.so.1 \
libmagic.so.1 \
libmagic1"

RDEPENDS:${PN} += "/sbin/ldconfig \
file-magic \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblz.so.1 \
liblzma.so.5 \
libz.so.1 \
libzstd.so.1"

inherit rpm
