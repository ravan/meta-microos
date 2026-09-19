SUMMARY = "Open vSwitch core libraries"
DESCRIPTION = "Contains the shared libraries used by Open vSwitch and any eventual extensions."
LICENSE = "Apache-2.0"

PV = "3.7.1"

RPM_NAME = "libopenvswitch-3_7-0-3.7.1-37.1.aarch64.rpm"
RPM_HASH = "3ce5b3f8dfc52b499d7e9d519aaf05d6b08e974739a03c902a4f9ea532df9d9913b8fd26dc030474eecbb9ea9a9520aab44d9614d70a29fcce65e48c0f63bf35"

RPROVIDES:${PN} += "libofproto-3.7.so.0 \
libopenvswitch-3-7-0 \
libopenvswitch-3.7.so.0 \
libovsdb-3.7.so.0 \
libsflow-3.7.so.0 \
libvtep-3.7.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
dpdk \
ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libcrypto.so.3 \
libdpdk-26 \
libm.so.6 \
libnuma.so.1 \
librte-eal.so.26 \
librte-ethdev.so.26 \
librte-log.so.26 \
librte-mbuf.so.26 \
librte-mempool.so.26 \
librte-meter.so.26 \
librte-vhost.so.26 \
libssl.so.3 \
libunbound.so.8 \
libxdp.so.1"

inherit rpm
