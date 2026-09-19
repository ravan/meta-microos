SUMMARY = "Development package for LASH"
DESCRIPTION = "This package contains the library for the LASH system."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "liblash1-0.5.4-5.7.aarch64.rpm"
RPM_HASH = "4b8606470b07c9296582152b356b507398704939f74a1e283f0c026d3f19d442f6c02f949055b85810eff8bcf67ae9a06bf1696bafe9fa8e51af0cfe0faf1536"

RPROVIDES:${PN} += "liblash.so.1 \
liblash1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
