SUMMARY = "Convenience utility for parallel job launch"
DESCRIPTION = "prun provides a unified, script-based wrapper for launching parallel jobs \
within a resource manager for a variety of MPI families."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "prun-ohpc-1.2-2.7.noarch.rpm"
RPM_HASH = "42cc9e1abb9f26433220d8fa751479efd73e374daa9ce01566122d93c52eeede3f54272f44f77a71deb5d27563791b9b869cd564022848f296a9b6a9817bf276"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-prun-ohpc \
prun-ohpc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
