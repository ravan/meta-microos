SUMMARY = "Files for Developing with libcuckoo"
DESCRIPTION = "Libcuckoo is a high-performance, concurrent hash table. \
This package contains the libcuckoo development files."
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "libcuckoo-devel-0.3.1-1.14.aarch64.rpm"
RPM_HASH = "099394ac6de3dad4bb1dd206dfb39aacde07b6b240edcdcc2a2d9b0e4617503603ffcfcbadde911cf6779a0efb62636c21445b236a3f3dc6e4a8279b79659fb4"

RPROVIDES:${PN} += "cmake-libcuckoo \
libcuckoo-devel"

RDEPENDS:${PN} += ""

inherit rpm
