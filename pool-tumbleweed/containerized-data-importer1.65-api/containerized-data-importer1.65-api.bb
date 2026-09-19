SUMMARY = "CDI API server"
DESCRIPTION = "The containerized-data-importer-api package provides the kubernetes API extension for CDI"
LICENSE = "Apache-2.0"

PV = "1.65.0"

RPM_NAME = "containerized-data-importer1.65-api-1.65.0-3.1.aarch64.rpm"
RPM_HASH = "80b52f77d4583f5f7b3631302b2cc3d253d3eb214d3f7a4675de569c18e7df7fd783185e1d4aa547e57f089752a6bed0dc29645a6d5d5e85e9dc2342a475fcb5"

RPROVIDES:${PN} += "containerized-data-importer-1.65-api \
containerized-data-importer-api \
containerized-data-importer1.65-api"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
