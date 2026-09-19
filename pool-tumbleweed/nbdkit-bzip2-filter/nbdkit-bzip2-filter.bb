SUMMARY = "BZip2 filter for nbdkit"
DESCRIPTION = "This package is a bzip2 filter for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.48.0"

RPM_NAME = "nbdkit-bzip2-filter-1.48.0-1.1.aarch64.rpm"
RPM_HASH = "dcfe13aabff119b1f9a5e0d35938d1b6134c647799ec9002902810d5d1e8eb054c8157212dff358ce72b6be602036877a78ac6e3b47994a52e8f3555a55c496f"

RPROVIDES:${PN} += "nbdkit-bzip2-filter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
nbdkit-server"

inherit rpm
