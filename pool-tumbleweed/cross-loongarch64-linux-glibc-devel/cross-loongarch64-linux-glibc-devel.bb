SUMMARY = "Linux headers for loongarch64 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for loongarch64, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "cross-loongarch64-linux-glibc-devel-7.2-2.1.noarch.rpm"
RPM_HASH = "728fa81ac028a0b9d2322cb2d56293720ff9471ddd26159149cc8832d6be89d56ffa7f39575594a52d2750bafaecaffa8d900b61ed7c0402f8bef8730a91a41a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-loongarch64-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
