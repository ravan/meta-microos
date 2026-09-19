SUMMARY = "Examples for the libibverbs library"
DESCRIPTION = "Useful libibverbs example programs such as ibv_devinfo, which \
displays information about RDMA devices."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "libibverbs-utils-63.0-1.3.aarch64.rpm"
RPM_HASH = "804bae08c6ac6e422ae526ac4cca89af1ea4b61395e0fa7bfb707b15700d557a084f9a8c994b326943f03e5ddedfa94b0e9246337bebbddb752e6159e75e42bb"

RPROVIDES:${PN} += "libibverbs-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs \
libibverbs.so.1"

inherit rpm
