SUMMARY = "Parallel scripting right from the Bourne-Again Shell"
DESCRIPTION = "MPI-Bash makes it possible to parallelize Bash scripts which run a set of \
Linux commands independently over a large number of input files. \
Because MPI-Bash includes various MPI functions for data transfer and \
synchronization, it is not limited to parallel workloads \
but can incorporate phased operations (i.e. all workers must finish \
operation X before any worker is allowed to begin operation Y)."
LICENSE = "GPL-3.0-or-later"

PV = "1.5"

RPM_NAME = "mpibash-1.5-2.3.aarch64.rpm"
RPM_HASH = "f9738205ce6927d84defe6b9e9c9a722340a51fb4e8235c3c1979d6e1b8733b975c989f809200155f08c2ccb432e54e1d8bc89739034044fac3470ede73eaa83"

RPROVIDES:${PN} += "mpibash"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
libcircle.so.2 \
libmpi.so.40 \
openmpi5-libs"

inherit rpm
