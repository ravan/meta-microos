SUMMARY = "HNS runtime library"
DESCRIPTION = "This package contains the hns runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "libhns1-63.0-1.3.aarch64.rpm"
RPM_HASH = "98bea8a5d932dbe9ce0e91a5f46b83d052d78c3d957dfcf51cefd38032f1d0370fee61d66c5415e1469d42eac0fb931d181765ecf69b5a87f5676b293c8c28ce"

RPROVIDES:${PN} += "libhns.so.1 \
libhns1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
