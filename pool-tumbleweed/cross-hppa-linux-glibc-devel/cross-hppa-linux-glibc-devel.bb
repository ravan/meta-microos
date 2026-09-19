SUMMARY = "Linux headers for hppa userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for hppa, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "cross-hppa-linux-glibc-devel-7.2-2.1.noarch.rpm"
RPM_HASH = "b8465532f6c97c3922ebbd282c0828f41c72e676ffc23d59efa4d8fedc9dc717bd7eec9d40c9e0c3fdc326111128e1cafebc58b35b336d1e4789cf8e8eeb743b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-hppa-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
