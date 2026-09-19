SUMMARY = "Library providing CPU identification for x86"
DESCRIPTION = "Libcpuid provides CPU identification for the x86 (and x86_64) \
architectures."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "libcpuid18-0.8.1-2.3.aarch64.rpm"
RPM_HASH = "3e7ccba09945bf04af96d47b3e955270c4e26ddbfc3abebc0fa47648b89b85f03989356c7d47cc01e0965a1f7ff73a326005c7ab6c3a465d02f391a326dfe3f5"

RPROVIDES:${PN} += "libcpuid.so.18 \
libcpuid18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
