SUMMARY = "Shared library for Discount markdown library"
DESCRIPTION = "Discount is a C language implementation of the Markdown markup language. \
 \
This package provides the shared library for Discount markdown library 2.x."
LICENSE = "BSD-3-Clause"

PV = "2.2.7d"

RPM_NAME = "libmarkdown2-2.2.7d-2.9.aarch64.rpm"
RPM_HASH = "dd47094c4ddc71c913c813ba1a74e901de91c1154a86f6fb2f53c0839c17baeff6db4fa652290dd2e634a223ce7dfce5d3da9bb7a40207dfc8fc86a0af063d6e"

RPROVIDES:${PN} += "libmarkdown.so.2 \
libmarkdown2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
