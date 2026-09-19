SUMMARY = "LXC hooks for lxcfs"
DESCRIPTION = "Configuration to add hooks for lxcfs so that it automatically interoperates \
with LXC for all containers."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "lxcfs-hooks-lxc-7.0.0-1.3.noarch.rpm"
RPM_HASH = "9d62006b73bc853bad3c235e2e5f6335d04139989ef4d774243a1644879699e8f39cfe018260d212fbc93b7252b0433c8cc44acaa17ca45a9914450e80ffc610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxcfs-hooks-lxc"

RDEPENDS:${PN} += "lxcfs"

inherit rpm
