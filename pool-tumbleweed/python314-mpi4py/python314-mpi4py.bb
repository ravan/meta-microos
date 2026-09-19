SUMMARY = "MPI for Python"
DESCRIPTION = "This package provides Python bindings for the Message Passing \
Interface (MPI) standard. It is implemented on top of the MPI-1/2/3 \
specification and exposes an API which grounds on the standard MPI-2 \
C++ bindings. \
 \
This package supports: \
  + Communication of any picklable Python object \
    * Point-to-point: send & receive \
    * Collective: broadcast, scatter & gather, reductions \
  + Communication of Python object exposing the Python buffer \
    interface (NumPy arrays, builtin bytes/string/array objects) \
    * Point-to-point: blocking/nonbloking/persistent send & receive \
    * Collective: broadcast, block/vector scatter & gather, reductions \
  + Process groups and communication domains \
    * Creation of new intra/inter communicators \
    * Cartesian & graph topologies \
  + Parallel input/output: \
    * read & write \
    * blocking/nonbloking & collective/noncollective \
    * individual/shared file pointers & explicit offset \
  + Dynamic process management \
    * spawn & spawn multiple \
    * accept/connect \
    * name publishing & lookup \
  + One-sided operations \
    * remote memory access: put, get, accumulate \
    * passive target syncronization: start/complete & post/wait \
    * active target syncronization: lock & unlock"
LICENSE = "BSD-3-Clause"

PV = "4.1.2"

RPM_NAME = "python314-mpi4py-4.1.2-1.2.aarch64.rpm"
RPM_HASH = "58711db588c56a2350cd382d696119a7129f2467dc68b8d3139d1627a18d7025fc791a98736fc1f55db00d2d80700940bccd5e5ba04daa62799d354343794b59"

RPROVIDES:${PN} += "python3.14dist-mpi4py \
python314-mpi4py \
python3dist-mpi4py"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmpi.so.40 \
python-abi"

inherit rpm
