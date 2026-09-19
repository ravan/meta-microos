SUMMARY = "Process Management Interface for MPI"
DESCRIPTION = "The Process Management Interface (PMI) has been used for quite some time as a \
means of exchanging wireup information needed for interprocess communication. Two \
versions (PMI-1 and PMI-2) have been released as part of the MPICH effort. While \
PMI-2 demonstrates better scaling properties than its PMI-1 predecessor, attaining \
rapid launch and wireup of the roughly 1M processes executing across 100k nodes \
expected for exascale operations remains challenging. \
 \
This RPM contains all the tools necessary to compile and link against PMIx."
LICENSE = "BSD-3-Clause"

PV = "3.2.5"

RPM_NAME = "pmix-3.2.5-2.10.aarch64.rpm"
RPM_HASH = "772fb8bf64a19fcc5f6a845911359a1c5335447e6c5fea84b85406e9c6a99b801325715be4a6b35458559b426842af4a1e840844b3b0dc66ad26b9fa747fad5f"

RPROVIDES:${PN} += "pmix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpmix.so.2"

inherit rpm
