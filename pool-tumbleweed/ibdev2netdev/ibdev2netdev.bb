SUMMARY = "List netdevs with their associated RDMA interface (IPoIB, RoCE, iWarp)"
DESCRIPTION = "ibdev2netdev lists netdevs with their associated RDMA interface (IPoIB, RoCE, iWarp)"
LICENSE = "GPL-3.0-only"

PV = "0.2.0"

RPM_NAME = "ibdev2netdev-0.2.0-1.9.aarch64.rpm"
RPM_HASH = "a6f8fe80e2e36660ed1193a76e287637668c8af795810a5e1cc47aeff082620151fd1d3ba6e82795c50508b91cbe09539023ca0a858fbe56dfa205442675888f"

RPROVIDES:${PN} += "ibdev2netdev"

RDEPENDS:${PN} += "libc.so.6 \
libibverbs.so.1"

inherit rpm
