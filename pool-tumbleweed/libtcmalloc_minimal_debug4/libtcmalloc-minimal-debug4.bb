SUMMARY = "Thread-caching malloc library"
DESCRIPTION = "This subpackage contains a library with optimized thread-caching \
malloc()."
LICENSE = "BSD-3-Clause"

PV = "2.18.1"

RPM_NAME = "libtcmalloc_minimal_debug4-2.18.1-1.4.aarch64.rpm"
RPM_HASH = "2b26387c47822f7be5a18be04c55ce10df0b0788d811b129ebcca05b56a75e9ce980827d6310a930311677871538dbd185d9910653f1f06790545c32f18da078"

RPROVIDES:${PN} += "libtcmalloc-minimal-debug.so.4 \
libtcmalloc-minimal-debug4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
