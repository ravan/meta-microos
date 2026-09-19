SUMMARY = "Utilities for setting and reading mura correction on Galileo"
DESCRIPTION = "This package provides utilities for setting \
and reading mura correction on Galileo."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "galileo-mura-0.9-1.5.aarch64.rpm"
RPM_HASH = "f92c42e774f042e2687b54890aa239017f79c2f43c55bd494a5d5089f0579db61c17a45b05e18e2940c5a4582f2a9a56143607133fb79428a72c23dc667095e9"

RPROVIDES:${PN} += "galileo-mura"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm
