SUMMARY = "Library & drivers for direct userspace use of InfiniBand/iWARP/RoCE hardware"
DESCRIPTION = "libibverbs is a library that allows userspace processes to use RDMA \
'verbs' as described in the InfiniBand Architecture Specification and \
the RDMA Protocol Verbs Specification.  This includes direct hardware \
access from userspace to InfiniBand/iWARP adapters (kernel bypass) for \
fast path operations. \
 \
Device-specific plug-in ibverbs userspace drivers are included: \
 \
- libcxgb4: Chelsio T4 iWARP HCA \
- libefa: Amazon Elastic Fabric Adapter \
- libhfi1: Intel Omni-Path HFI \
- libhns: HiSilicon Hip08+ SoC \
- libionic: AMD Pensando Distributed Services Card (DSC) RDMA/RoCE Support \
- libipathverbs: QLogic InfiniPath HCA \
- libirdma: Intel Ethernet Connection RDMA \
- libmana: Microsoft Azure Network Adapter \
- libmlx4: Mellanox ConnectX-3 InfiniBand HCA \
- libmlx5: Mellanox Connect-IB/X-4+ InfiniBand HCA \
- libmthca: Mellanox InfiniBand HCA \
- libocrdma: Emulex OneConnect RDMA/RoCE Device \
- libqedr: QLogic QL4xxx RoCE HCA \
- librxe: A software implementation of the RoCE protocol \
- libsiw: A software implementation of the iWarp protocol \
- libvmw_pvrdma: VMware paravirtual RDMA device"
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "libibverbs-63.0-1.3.aarch64.rpm"
RPM_HASH = "6f2c3c42adb9ab3cb5969daa11bbbddf06cbe254e81280a7cd262c4ac9a80b042591dcaa6443b5b03121f966424cb95fef598d2dd3eed2a3435291ac1c973d1e"

RPROVIDES:${PN} += "config-libibverbs \
libbnxt-re-rdmav59.so \
libcxgb4-rdmav59.so \
liberdma-rdmav59.so \
libhfi1verbs-rdmav59.so \
libibverbs \
libipathverbs-rdmav59.so \
libirdma-rdmav59.so \
libmthca-rdmav59.so \
libocrdma-rdmav59.so \
libqedr-rdmav59.so \
librxe-rdmav59.so \
libsiw-rdmav59.so \
libvmw-pvrdma-rdmav59.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libefa1 \
libhns1 \
libibverbs.so.1 \
libionic1 \
libmana1 \
libmlx4-1 \
libmlx5-1"

inherit rpm
