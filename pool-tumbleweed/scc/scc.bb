SUMMARY = "CLI tool to report lines of code and other metrics"
DESCRIPTION = "A tool similar to cloc, sloccount and tokei. For counting physical the lines of \
code, blank lines, comment lines, and physical lines of source code in many \
programming languages. \
 \
Binary name is sccount to avoid conflict with the Steam game controller driver."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "scc-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "5e4e36a377acab270ca383017bd6077b587a5ef1e0fccc9350eb850da0a9bc6faf4d8cc78a175aa69fd1a0c16112df4263ca612053284da750de76c7ee7c90d0"

RPROVIDES:${PN} += "scc"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
