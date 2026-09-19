SUMMARY = "Which for Dynamic Libraries"
DESCRIPTION = "A command line utility to locate shared libraries by name."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "libwhich-1.3.0-1.3.aarch64.rpm"
RPM_HASH = "f9192ad53610e8dba1f58edfca08f41a5c19d00ac5a3d5c059f43727f68f9a7bec691b6487211c86980dac7b23c8b5eae8693cd1186a0222d3003f830e0a3871"

RPROVIDES:${PN} += "libwhich"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
