SUMMARY = "Library files for libenet"
DESCRIPTION = "The libenet7 package contains libraries for libenet."
LICENSE = "MIT"

PV = "1.3.18"

RPM_NAME = "libenet7-1.3.18-1.9.aarch64.rpm"
RPM_HASH = "2e1cd7ce8ffe4cac832d1a0d9a437e8ed23468f9f8fb1d8da96bfabad272a2d817dcd10467eb49cb2a7072d9905491738635a2ccce5c69cdd7a6cbb49f63322c"

RPROVIDES:${PN} += "libenet.so.7 \
libenet7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
