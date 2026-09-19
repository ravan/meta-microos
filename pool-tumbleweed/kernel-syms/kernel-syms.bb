SUMMARY = "Kernel Symbol Versions (modversions)"
DESCRIPTION = "Kernel symbols, such as functions and variables, have version \
information attached to them. This package contains the symbol versions \
for the standard kernels. \
 \
This package is needed for compiling kernel module packages with proper \
package dependencies. \
 \
 \
Source Timestamp: 2026-09-12 06:50:42 +0000 \
GIT Revision: 6b7e8a968cce3b45e63d59e1d4981c9b7c5bc6b5 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kernel-syms-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "d4462a724b2bbec2e465067971f2bf54a2f015ea872ba04cf31dfed60921b2ceaed501fcbcb2d9608814b5eab854c9945c6e0a7f8c6986d46ed30d3c1bd9a5d3"

RPROVIDES:${PN} += "kernel-syms \
kernel-syms-srchash-6b7e8a968cce3b45e63d59e1d4981c9b7c5bc6b5 \
multiversion-kernel"

RDEPENDS:${PN} += "kernel-64kb-devel \
kernel-default-devel \
kernel-devel"

inherit rpm
