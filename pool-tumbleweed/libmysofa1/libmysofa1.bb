SUMMARY = "Reader for AES SOFA HRTF files"
DESCRIPTION = "This is a C library to read AES SOFA files that contain HRTFs stored \
according to the AES69-2015 standard."
LICENSE = "BSD-3-Clause"

PV = "1.3.5"

RPM_NAME = "libmysofa1-1.3.5-1.1.aarch64.rpm"
RPM_HASH = "1841317ff8795960b32ccc470c54f3aa9058abbb0a0bf902b56063fc06671667f91fe4fdd61fd58d9eaacdce7c884fd9c1c930a3a29e20e7c96358f6434afe15"

RPROVIDES:${PN} += "libmysofa.so.1 \
libmysofa1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
