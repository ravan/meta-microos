SUMMARY = "MPI Benchmarks common files"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.10 OSU benchmarks ver 7.5.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-3.2-20.3.aarch64.rpm"
RPM_HASH = "6a9dd9d8ccc4efe6909e81a0eedf36e48c5d41018a247d3dad59cfdbabb83f046daf500884b2265b1685d5a43af1de8728de824fe59c088446af52095ee36b5b"

RPROVIDES:${PN} += "mpitests"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
