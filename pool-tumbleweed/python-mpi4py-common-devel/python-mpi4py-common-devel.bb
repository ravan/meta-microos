SUMMARY = "Shared development files for python-mpi4py"
DESCRIPTION = "Development libraries and headers needed to build packages using python-mpi4py. \
 \
You normally do not need to install this directly, it will be pulled in by \
the python-specific devel package."
LICENSE = "BSD-3-Clause"

PV = "4.1.2"

RPM_NAME = "python-mpi4py-common-devel-4.1.2-1.2.noarch.rpm"
RPM_HASH = "5af29469adc3f8d6d0e16f7e16a76330268bd820bd5996d3643248c8dcb55d4c270d36298b260e9a2697c38fc5afc2d50876e0bba44a442e890ead9596826fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-mpi4py-common-devel \
python313-mpi4py-common-devel \
python314-mpi4py-common-devel"

RDEPENDS:${PN} += "openmpi5-devel"

inherit rpm
