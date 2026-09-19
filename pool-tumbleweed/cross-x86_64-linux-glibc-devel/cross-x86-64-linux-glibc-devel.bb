SUMMARY = "Linux headers for x86_64 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for x86_64, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "cross-x86_64-linux-glibc-devel-7.2-2.1.noarch.rpm"
RPM_HASH = "3d00c00183d3b3d13a8d35792d87dbec0028b18c8875d68066fa3a7fafc53a0d668548bcaa1037740e887463cc666ec8e738b37a471d97be7b6c1082fc02293c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-x86-64-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
