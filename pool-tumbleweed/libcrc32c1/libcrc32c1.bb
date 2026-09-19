SUMMARY = "CRC32C implementation with support for CPU-specific acceleration instructions"
DESCRIPTION = "This project collects a few CRC32C implementations under an umbrella \
that dispatches to a suitable implementation based on the host computer's \
hardware capabilities. \
 \
CRC32C is specified as the CRC that uses the iSCSI polynomial in RFC 3720. \
The polynomial was introduced by G. Castagnoli, S. Braeuer and M. Herrmann."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "libcrc32c1-1.1.2-2.9.aarch64.rpm"
RPM_HASH = "e378c295ee76bf1ba4143868b81722059b8f6ab2104db470475938f90d8868aa8052d3456ff162f0f8ba2407b63f94b46ce3e487e2c7cfa907aaa35e718be060"

RPROVIDES:${PN} += "libcrc32c.so.1 \
libcrc32c1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libstdc++.so.6"

inherit rpm
