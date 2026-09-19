SUMMARY = "Kernel Symbol Versions (modversions)"
DESCRIPTION = "Kernel symbols, such as functions and variables, have version \
information attached to them. This package contains the symbol versions \
for the standard kernels. \
 \
This package is needed for compiling kernel module packages with proper \
package dependencies. \
 \
 \
Source Timestamp: 2026-09-12 22:20:24 +0000 \
GIT Revision: 5fd8dd86aa6ed38923322b5ebd90adc85e8e7c55 \
GIT Branch: slowroll"
LICENSE = "GPL-2.0-only"

PV = "6.18.51"

RPM_NAME = "kernel-syms-longterm-6.18.51-1.1.aarch64.rpm"
RPM_HASH = "4b5d907ea519daa109d455321bd07d07d1ce6fc6d247d0bb87c780d129dbf6076c6d954bb0f0a5ce2fc275b4eeca2238965d657bf815ed0dc6ce736de93cddf4"

RPROVIDES:${PN} += "kernel-syms-longterm \
kernel-syms-longterm-srchash-5fd8dd86aa6ed38923322b5ebd90adc85e8e7c55 \
multiversion-kernel"

RDEPENDS:${PN} += "kernel-devel-longterm \
kernel-longterm-devel"

inherit rpm
