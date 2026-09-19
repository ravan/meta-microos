SUMMARY = "Linux headers for ppc64 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for ppc64, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "cross-ppc64-linux-glibc-devel-7.2-2.1.noarch.rpm"
RPM_HASH = "bb7442bc151ebeb22b9ba6f79b9b09013294d5c58c717a73762fcb1fe23ddfa63de7e017ac0e7592e5467e6a339ef5347e40cbc50a3fcd321c7e82c1254e6076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-ppc64-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
