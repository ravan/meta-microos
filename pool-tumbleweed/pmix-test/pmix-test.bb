SUMMARY = "Test packages for PMIx"
DESCRIPTION = "Test binaries which allow to test proper PMIx operations."
LICENSE = "BSD-3-Clause"

PV = "3.2.5"

RPM_NAME = "pmix-test-3.2.5-2.10.aarch64.rpm"
RPM_HASH = "66d608f7474ddd18078f20a3a07dbdad066f632e5e5936ef735a8424f68a27781862b944f69dbfab8b0817dfeba4525e535ca6bdbfa46851922c469de6a1ce8f"

RPROVIDES:${PN} += "pmix-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-core-2.1.so.7 \
libpmix.so.2"

inherit rpm
