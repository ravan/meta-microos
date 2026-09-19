SUMMARY = "CLI tool to scan the Go AST and SSA code representations for security problems"
DESCRIPTION = "CLI tool to inspect Go source code for security problems by scanning the \
abstract syntax tree (AST) and static single-assignment (SSA) code \
representations."
LICENSE = "Apache-2.0"

PV = "2.29.0"

RPM_NAME = "gosec-2.29.0-1.1.aarch64.rpm"
RPM_HASH = "f0e9e27366f81cbfdc488c6f3de1f4b00f2a04bfba77a8c94f596b93f877e767a9e230f991a21a3b1ac388204b00698cb51fdfca40d2bcc5c360e8041ac01a0d"

RPROVIDES:${PN} += "gosec"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
