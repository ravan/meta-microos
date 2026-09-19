SUMMARY = "Linux headers for sparc64 userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for sparc64, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "cross-sparc64-linux-glibc-devel-7.2-2.1.noarch.rpm"
RPM_HASH = "f9e8f7ca8a3b40d87c928585b79d8dc05ac2d4e5c77b8121ea6daaade28ee10c79c1de20e1349be1d28ec8dbc99242a690feec75885f45493bf121e1f1051717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-sparc64-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
