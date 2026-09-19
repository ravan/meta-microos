SUMMARY = "Execute a command in a specific directory"
DESCRIPTION = "A tool that lets you run a command in a specific directory. It supports shell commands and path aliases. execdir will try to get an alias if the path doesn't exist. \
Example usage: execdir <dir> <command> [<arguments> ...]"
LICENSE = "MIT"

PV = "0.5.0.git1780765455"

RPM_NAME = "execdir-0.5.0.git1780765455-1.3.aarch64.rpm"
RPM_HASH = "a1a3b39c9ba14c001274941c9a1a532d0ff10e5c89e5e9de818193ac27d8ab40c8ea783234258cfe9efd52361ea3e51a0cf6736d2c64ba0663557329f408ed44"

RPROVIDES:${PN} += "execdir"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblmdb-0.9.35.so"

inherit rpm
