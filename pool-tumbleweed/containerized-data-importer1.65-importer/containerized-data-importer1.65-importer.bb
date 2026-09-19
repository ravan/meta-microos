SUMMARY = "Data fetching service"
DESCRIPTION = "Data fetching service for VM container imagess"
LICENSE = "Apache-2.0"

PV = "1.65.0"

RPM_NAME = "containerized-data-importer1.65-importer-1.65.0-3.1.aarch64.rpm"
RPM_HASH = "6a24575550deef15d2165c2105124c8fecd45939618213c1059794d0471b55bb7a4ebacbb6b51b8cc4748ef2f6460e05b81a833b62cf02b7f06fa415df76851b"

RPROVIDES:${PN} += "containerized-data-importer-1.65-importer \
containerized-data-importer-importer \
containerized-data-importer1.65-importer"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
