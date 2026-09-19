SUMMARY = "Data Plane Development Kit example applications"
DESCRIPTION = "Example applications utilizing the Data Plane Development Kit, such \
as L2 and L3 forwarding."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "25.11.3"

RPM_NAME = "dpdk-examples-25.11.3-1.1.aarch64.rpm"
RPM_HASH = "d385966b7d6aa25f6c0c0f5e3e3f4820c301e7007b97ad43a6ce08110178e81661f779005db292be9c33ac2c5c66e08ed8cadcad6b3bdef78c4db75908907d62"

RPROVIDES:${PN} += "dpdk-examples \
dpdk-thunderx-examples"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcrypto.so.3 \
libfdt.so.1 \
libjansson.so.4 \
libm.so.6 \
libnuma.so.1 \
libpcap.so.1 \
librte-acl.so.26 \
librte-argparse.so.26 \
librte-bbdev.so.26 \
librte-bus-pci.so.26 \
librte-bus-vdev.so.26 \
librte-cfgfile.so.26 \
librte-cmdline.so.26 \
librte-crypto-scheduler.so.26 \
librte-cryptodev.so.26 \
librte-distributor.so.26 \
librte-dmadev.so.26 \
librte-eal.so.26 \
librte-efd.so.26 \
librte-ethdev.so.26 \
librte-eventdev.so.26 \
librte-fib.so.26 \
librte-graph.so.26 \
librte-hash.so.26 \
librte-ip-frag.so.26 \
librte-ipsec.so.26 \
librte-jobstats.so.26 \
librte-kvargs.so.26 \
librte-log.so.26 \
librte-lpm.so.26 \
librte-mbuf.so.26 \
librte-mempool.so.26 \
librte-meter.so.26 \
librte-metrics.so.26 \
librte-net-bnxt.so.26 \
librte-net-bond.so.26 \
librte-net-i40e.so.26 \
librte-net-ixgbe.so.26 \
librte-net.so.26 \
librte-node.so.26 \
librte-pcapng.so.26 \
librte-pci.so.26 \
librte-pipeline.so.26 \
librte-port.so.26 \
librte-power-kvm-vm.so.26 \
librte-power.so.26 \
librte-raw-ntb.so.26 \
librte-rawdev.so.26 \
librte-rcu.so.26 \
librte-reorder.so.26 \
librte-rib.so.26 \
librte-ring.so.26 \
librte-sched.so.26 \
librte-security.so.26 \
librte-table.so.26 \
librte-telemetry.so.26 \
librte-timer.so.26 \
librte-vhost.so.26 \
libssl.so.3 \
libvirt.so.0"

inherit rpm
