SUMMARY = "Linux headers for riscv64 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for riscv64, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "cross-riscv64-linux-glibc-devel-7.2-2.1.noarch.rpm"
RPM_HASH = "79cfb8cc3671cd57f74baf8a43091db26f60185825abc6e171c0f68d059b61dc6368c59ce5a54dea6ad3e7c1ed5a7615755f229c65625a8c0175fdf73b6bb9a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-riscv64-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
