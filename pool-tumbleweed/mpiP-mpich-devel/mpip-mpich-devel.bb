SUMMARY = "Headers for profiling library for MPI applications"
DESCRIPTION = "mpiP is a profiling library for MPI applications. This packages contains \
the build headers."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-mpich-devel-3.5-10.4.aarch64.rpm"
RPM_HASH = "44de6dc182bd178372bfa66efcb311bbb44b6b8fcd05d564203a99dad192f383eac7d99071e63990025fc0f78293a7b57f8728e44fc53ea187b623bab9300505"

RPROVIDES:${PN} += "mpiP-mpich-devel"

RDEPENDS:${PN} += ""

inherit rpm
