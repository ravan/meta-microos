SUMMARY = "Documentation for the mpiP profiling library"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-mvapich3-ofi-doc-3.5-10.4.aarch64.rpm"
RPM_HASH = "a2dec5edf98bc1104127fd2880367ca54ff3c1a02733f6b82ed2be01a9d3c79a33acc01eb0f32ae1e9ea0ffb8ca24dade5349475ea18be3101b6df5826d08bbf"

RPROVIDES:${PN} += "mpiP-mvapich3-ofi-doc"

RDEPENDS:${PN} += ""

inherit rpm
