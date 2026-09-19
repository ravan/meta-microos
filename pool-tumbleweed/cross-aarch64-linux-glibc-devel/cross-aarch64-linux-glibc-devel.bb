SUMMARY = "Linux headers for aarch64 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for aarch64, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "cross-aarch64-linux-glibc-devel-7.2-2.1.noarch.rpm"
RPM_HASH = "9efb5994f1484605ef81072eefbc7dd6cd3cc9d02e7e23a8f773876a99381f1a4ba6c34539ba07275536900309f04f32ddad7d84dbd735845d34d9f8395a7199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-aarch64-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
