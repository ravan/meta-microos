SUMMARY = "Run multiple jobs at once"
DESCRIPTION = "parallel [options] [command]-- [argument ...] \
 \
parallel runs the specified command, passing it a single one of the specified arguments. \
This is repeated for each argument. Jobs may be run in parallel. The default is to run one job per CPU."
LICENSE = "GPL-2.0-only"

PV = "0.70"

RPM_NAME = "moreutils-parallel-0.70-1.9.aarch64.rpm"
RPM_HASH = "c3ad77f213a9f6b929d080d81ec7bf188d56b6972d2607caf5dee6d1f8f69f234695dcd6a87581ffea26c2715e49a8d2ad9fcd1b749d902076a44c10c8ef6939"

RPROVIDES:${PN} += "moreutils-parallel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
