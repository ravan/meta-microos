SUMMARY = "Tools based on libcpuid"
DESCRIPTION = "This package provides tools based on libcpuid."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "libcpuid-tools-0.8.1-2.3.aarch64.rpm"
RPM_HASH = "741bcf5b67c0c7ffae27b645dd48435b335957eb3ef967d435eddf3f0ecdf2b43d86b77227a11583556ef681b2d1e8a4b11f981ecaa6bf7cf5ad9f2fe2267e34"

RPROVIDES:${PN} += "libcpuid-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcpuid.so.18"

inherit rpm
