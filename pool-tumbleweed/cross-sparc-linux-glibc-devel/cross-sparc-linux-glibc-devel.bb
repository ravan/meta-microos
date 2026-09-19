SUMMARY = "Linux headers for sparc userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for sparc, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "cross-sparc-linux-glibc-devel-7.2-2.1.noarch.rpm"
RPM_HASH = "5b6a4d4d1042d38d54854d0f5f30dcc0dbaf3e5e016c3667fdfd2e19d17b4560118011013e07bb0bb4712f8a2cdcc585e32b60e3cb4044d23dc310833501dbc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-sparc-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
