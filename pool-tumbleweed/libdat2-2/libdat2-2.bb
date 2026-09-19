SUMMARY = "DAPL runtime libraries"
DESCRIPTION = "libdat and libdapl provide a userspace RDMA API that supports DAT 2.0 \
specification and IB transport extensions for atomic operations and \
rdma write with immediate data. \
 \
This package contains the runtime libraries."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later | CPL-1.0"

PV = "2.1.10"

RPM_NAME = "libdat2-2-2.1.10-9.6.aarch64.rpm"
RPM_HASH = "303217a12ed16fab9e46b6c2c271f4e44a5454332baf2167eca2612559c251e1869db0c38a4af671016662db0a3f99c60e0a8ee6b32f61b7b48a86064b4b2b70"

RPROVIDES:${PN} += "dapl2 \
libdat2-2 \
libdat2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
dapl \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
