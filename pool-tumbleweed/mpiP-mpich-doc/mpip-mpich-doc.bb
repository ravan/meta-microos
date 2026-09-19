SUMMARY = "Documentation for the mpiP profiling library"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-mpich-doc-3.5-10.4.aarch64.rpm"
RPM_HASH = "6a69d770ba2139194c548e49c8c6ef54a091b955325c9e1cd8016ca1853ca9ba9eeba59f896ceae10b930bae85ec5ea7b17d66d356ca2b81dbf0175e5e4543fe"

RPROVIDES:${PN} += "mpiP-mpich-doc"

RDEPENDS:${PN} += ""

inherit rpm
