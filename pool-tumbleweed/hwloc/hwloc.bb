SUMMARY = "Portable Hardware Locality"
DESCRIPTION = "The Portable Hardware Locality (hwloc) software package provides \
an abstraction (across OS, versions, architectures, ...) \
of the hierarchical topology of modern architectures, including \
NUMA memory nodes, shared caches, processor sockets, processor cores \
and processing units (logical processors or 'threads'). It also gathers \
various system attributes such as cache and memory information. It primarily \
aims at helping applications with gathering information about modern \
computing hardware so as to exploit it accordingly and efficiently. \
 \
hwloc may display the topology in multiple convenient formats. \
It also offers a powerful programming interface (C API) to gather information \
about the hardware, bind processes, and much more."
LICENSE = "BSD-3-Clause"

PV = "2.13.0"

RPM_NAME = "hwloc-2.13.0-1.3.aarch64.rpm"
RPM_HASH = "44d354681359bc6f8904f7babb07cfe48f7d5fc35574cf48517864636bdef7d65ed6dd58abf1c946d783bff75dc45f364df5a36e06929347af987da3b1688708"

RPROVIDES:${PN} += "hwloc"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-file-utils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhwloc.so.15 \
libhwloc15 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
perl-JSON \
perl-base"

inherit rpm
