SUMMARY = "YaST2 - YCP Bindings for the YaST2 User Interface Engine (dummy implementation)"
DESCRIPTION = "This package provides dummy implementation for the generic YaST2 user \
interface engine."
LICENSE = "GPL-2.0-only"

PV = "5.0.0"

RPM_NAME = "yast2-ycp-ui-bindings-dummy-5.0.0-1.4.aarch64.rpm"
RPM_HASH = "2ebfcc2dd406bf1fc61812a42c1ec14337710b8b07d78fc2b48d0ee2a71d0be0c7253d9ffefbb5f35e7bc0122e0083b76be74a7237ca8088af059d7ecc56cedc"

RPROVIDES:${PN} += "libpy2UI.so.2 \
yast2-ycp-ui-bindings-dummy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
yast2-core"

inherit rpm
