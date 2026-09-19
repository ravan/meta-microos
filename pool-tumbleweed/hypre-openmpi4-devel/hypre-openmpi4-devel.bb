SUMMARY = "Headers and library links for libHYPRE301-openmpi4"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi4 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "hypre-openmpi4-devel-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "dc0ca37c7d4753cec90eb5848d6473bf093b348f39dd79d2acc9f45aa8e29a772aaf0a6f897229b1132ce34b40e90dd9e03e598000ab62cd07a4cd35158c0024"

RPROVIDES:${PN} += "hypre-openmpi4-devel"

RDEPENDS:${PN} += "lapack-devel \
libHYPRE301-openmpi4 \
superlu-devel"

inherit rpm
