SUMMARY = "Traces all program executions occurring on a system"
DESCRIPTION = "extrace traces all program executions occurring on a system and prints the process call hierarchy in a human-readable form. \
 \
While process tracing is exact, looking up all information is inherently sensitive to race conditions. In doubt, you can only trust the PID was written correctly."
LICENSE = "GPL-2.0-only"

PV = "0.9"

RPM_NAME = "extrace-0.9-1.12.aarch64.rpm"
RPM_HASH = "d5a4d5126c58a0951e8f3959a8afd9f3ea6f1b02f40be32bb4aff5646ee7563568fd70486a7c75c585f3ee2e8895b441cc7ee6494ee8ea04c719efa281c64512"

RPROVIDES:${PN} += "extrace"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
