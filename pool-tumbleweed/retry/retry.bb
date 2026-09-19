SUMMARY = "A simple tool for retrying command executions in plain POSIX sh"
DESCRIPTION = "A simple tool for retrying command executions in plain POSIX sh."
LICENSE = "MIT"

PV = "1737025645.819c129"

RPM_NAME = "retry-1737025645.819c129-1.6.noarch.rpm"
RPM_HASH = "74409d559de87fbad115aa0f73b73128b912e8c5eb5d20cd8202051daa55ef7be8f92bdc0668c8dca23853f507dd344da068b6554e26d00918a8fb1b8db1730c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "retry"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
util-linux"

inherit rpm
