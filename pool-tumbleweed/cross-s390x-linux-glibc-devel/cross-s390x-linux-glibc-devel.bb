SUMMARY = "Linux headers for s390x userspace cross development"
DESCRIPTION = "This package provides Linux kernel headers for s390x, the kernel API description \
required for compilation of almost all programs."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "cross-s390x-linux-glibc-devel-7.2-2.1.noarch.rpm"
RPM_HASH = "556dd235b19ca4c04532a86183425a7a14d33b901db414456678d47b5a7b3f570b068ec1fbac04703a7f774ae19d53cee27c6562eef045efc0a72345b015abe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-s390x-linux-glibc-devel"

RDEPENDS:${PN} += ""

inherit rpm
