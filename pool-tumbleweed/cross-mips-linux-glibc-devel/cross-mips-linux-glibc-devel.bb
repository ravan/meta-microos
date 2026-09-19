SUMMARY = "Linux headers for mips userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for mips, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "cross-mips-linux-glibc-devel-7.2-2.1.noarch.rpm"
RPM_HASH = "e99ef6e27b85716dfa5a73e61a29c84bdcb81f22c2729a4a4c29dc8320cb1a33642f1ba782498de487ecf78590610cb53002b913cf93fc751f8b8b29cba71e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-mips-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
