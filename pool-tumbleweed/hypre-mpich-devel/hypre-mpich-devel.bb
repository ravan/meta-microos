SUMMARY = "Headers and library links for libHYPRE301-mpich"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the mpich version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "3.1.0"

RPM_NAME = "hypre-mpich-devel-3.1.0-1.2.aarch64.rpm"
RPM_HASH = "9f6e3be52d0c6c7aec9fadaa4b85dd4f13407d712633660d7baa6483a207401087c2eaa59c34934d97ab36cd81d2dcd0a78c0b973766cbc844049ae93798e755"

RPROVIDES:${PN} += "hypre-mpich-devel"

RDEPENDS:${PN} += "lapack-devel \
libHYPRE301-mpich \
superlu-devel"

inherit rpm
