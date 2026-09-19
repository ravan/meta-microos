SUMMARY = "Run kubectl commands in all/some contexts in parallel"
DESCRIPTION = "Run a kubectl command in one or more contexts (clusters) in parallel (similar to GNU parallel/xargs)."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "kubectl-foreach-0.3.0-1.14.aarch64.rpm"
RPM_HASH = "addb3766c5f17305b333fe2f85f4538aadb99ce17951fc79e1708de9f35b64105ac3e4d07954102d5d6ccb90d992c52494c39d59e60e73c0b921a935de9620af"

RPROVIDES:${PN} += "kubectl-foreach"

RDEPENDS:${PN} += ""

inherit rpm
