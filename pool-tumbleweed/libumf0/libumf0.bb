SUMMARY = "oneAPI Unified Memory Framework (UMF)"
DESCRIPTION = "The Unified Memory Framework (UMF) is a library for constructing allocators \
and memory pools. UMF allows users to manage multiple memory pools characterized \
by different attributes, allowing certain allocation types to be isolated \
from others and allocated using different hardware resources as required."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "libumf0-0.11.0-1.5.aarch64.rpm"
RPM_HASH = "3bb36a226f684c000c79702a31bca713c15f331590d2f9664cbb3177a5b88b8bcea2a17f6ba09302b549ebee8455d428de7b2b76fc1b2cf034d5993b43a034e5"

RPROVIDES:${PN} += "libumf-proxy.so.0 \
libumf.so.0 \
libumf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhwloc.so.15"

inherit rpm
