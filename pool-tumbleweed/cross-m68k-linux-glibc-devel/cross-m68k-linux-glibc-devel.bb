SUMMARY = "Linux headers for m68k userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for m68k, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "cross-m68k-linux-glibc-devel-7.2-2.1.noarch.rpm"
RPM_HASH = "5772969f52570efa9c946f1726d548883ff30e66de94b6da6e6ac10d7551788ed7411e86290f6402aaeb2ca950fcc5da8e5f215db92fabfcf0109017eda0f746"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-m68k-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
