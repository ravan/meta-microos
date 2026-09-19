SUMMARY = "Data fetching service"
DESCRIPTION = "Data fetching service for VM container imagess"
LICENSE = "Apache-2.0"

PV = "1.66.1"

RPM_NAME = "containerized-data-importer1.66-importer-1.66.1-1.1.aarch64.rpm"
RPM_HASH = "81bbcfe14386202fcc824c2fdba673a64761006769316dff6cd3e8ae65878f5e1ea25ccc0b7c7c4c378e1de977cec8ad7a8105f17ec3f673290b6d4757e70ebf"

RPROVIDES:${PN} += "containerized-data-importer-importer \
containerized-data-importer1.66-importer"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
