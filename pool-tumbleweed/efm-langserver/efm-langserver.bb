SUMMARY = "General purpose language server"
DESCRIPTION = "General purpose Language Server that can use specified error message format generated from specified command e.g. \
using linters and other tooling that supports the LSP specification."
LICENSE = "MIT"

PV = "0.0.54"

RPM_NAME = "efm-langserver-0.0.54-1.10.aarch64.rpm"
RPM_HASH = "e0d01e8fb87b71544545990cdf9086238881ea8dda0686fedb8a9325ca3d0a4e9b9803f9ad4820d42205211886c281daa242cc519aa2dd8d98d988a38c1d8454"

RPROVIDES:${PN} += "efm-langserver"

RDEPENDS:${PN} += ""

inherit rpm
