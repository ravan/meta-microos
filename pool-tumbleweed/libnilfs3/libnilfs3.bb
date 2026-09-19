SUMMARY = "Library for interacting with nilfs"
DESCRIPTION = "This package contains shared library needed for some applications to \
interface with nilfs"
LICENSE = "GPL-2.0-only"

PV = "2.3.1"

RPM_NAME = "libnilfs3-2.3.1-2.3.aarch64.rpm"
RPM_HASH = "94207e5d8f8b9b4538f5660f204065b2e1f5b9d6a54be99918875c87b7d451cecf4b8c8c82ddc973282dd0db829a9dff38a094ec0703a16ec0ae9e6e4e495c93"

RPROVIDES:${PN} += "libnilfs.so.3 \
libnilfs3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
