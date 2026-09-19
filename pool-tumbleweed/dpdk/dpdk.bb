SUMMARY = "Set of libraries and drivers for fast packet processing"
DESCRIPTION = "The Data Plane Development Kit is a set of libraries and drivers for \
fast packet processing in the user space."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "25.11.3"

RPM_NAME = "dpdk-25.11.3-1.1.aarch64.rpm"
RPM_HASH = "c1a06ef33f772407fb1de116f2431ea56d521b33553f74c1813f3d13e72a52a211d08ad00d2dc3f4a10941427dc56f4c79497cc4012f743dcc2b2b1421f86fa1"

RPROVIDES:${PN} += "dpdk \
dpdk-thunderx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libelf.so.1 \
libfdt.so.1 \
libibverbs.so.1 \
libjansson.so.4 \
libm.so.6 \
libmlx5.so.1 \
libnuma.so.1 \
libpcap.so.1 \
librte-acl.so.26 \
librte-argparse.so.26 \
librte-baseband-acc.so.26 \
librte-baseband-fpga-5gnr-fec.so.26 \
librte-baseband-fpga-lte-fec.so.26 \
librte-baseband-la12xx.so.26 \
librte-bbdev.so.26 \
librte-bitratestats.so.26 \
librte-bpf.so.26 \
librte-bus-auxiliary.so.26 \
librte-bus-dpaa.so.26 \
librte-bus-pci.so.26 \
librte-bus-vdev.so.26 \
librte-cfgfile.so.26 \
librte-cmdline.so.26 \
librte-common-dpaax.so.26 \
librte-common-mlx5.so.26 \
librte-compressdev.so.26 \
librte-crypto-scheduler.so.26 \
librte-cryptodev.so.26 \
librte-dispatcher.so.26 \
librte-distributor.so.26 \
librte-dmadev.so.26 \
librte-eal.so.26 \
librte-efd.so.26 \
librte-ethdev.so.26 \
librte-eventdev.so.26 \
librte-fib.so.26 \
librte-gpudev.so.26 \
librte-graph.so.26 \
librte-gro.so.26 \
librte-gso.so.26 \
librte-hash.so.26 \
librte-ip-frag.so.26 \
librte-ipsec.so.26 \
librte-kvargs.so.26 \
librte-latencystats.so.26 \
librte-log.so.26 \
librte-lpm.so.26 \
librte-mbuf.so.26 \
librte-member.so.26 \
librte-mempool-dpaa.so.26 \
librte-mempool.so.26 \
librte-meter.so.26 \
librte-metrics.so.26 \
librte-mldev.so.26 \
librte-net-bnxt.so.26 \
librte-net-bond.so.26 \
librte-net-dpaa.so.26 \
librte-net-i40e.so.26 \
librte-net-iavf.so.26 \
librte-net-ice.so.26 \
librte-net-ixgbe.so.26 \
librte-net-mlx5.so.26 \
librte-net-null.so.26 \
librte-net-ring.so.26 \
librte-net.so.26 \
librte-node.so.26 \
librte-pcapng.so.26 \
librte-pci.so.26 \
librte-pdcp.so.26 \
librte-pdump.so.26 \
librte-pipeline.so.26 \
librte-pmu.so.26 \
librte-port.so.26 \
librte-power-acpi.so.26 \
librte-power-amd-pstate.so.26 \
librte-power-cppc.so.26 \
librte-power-intel-pstate.so.26 \
librte-power-intel-uncore.so.26 \
librte-power-kvm-vm.so.26 \
librte-power.so.26 \
librte-raw-skeleton.so.26 \
librte-rawdev.so.26 \
librte-rcu.so.26 \
librte-regexdev.so.26 \
librte-reorder.so.26 \
librte-rib.so.26 \
librte-ring.so.26 \
librte-sched.so.26 \
librte-security.so.26 \
librte-stack.so.26 \
librte-table.so.26 \
librte-telemetry.so.26 \
librte-timer.so.26 \
libz.so.1"

inherit rpm
