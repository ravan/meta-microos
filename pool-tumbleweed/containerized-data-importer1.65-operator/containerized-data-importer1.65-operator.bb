SUMMARY = "Operator for the data fetching service"
DESCRIPTION = "Operator for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.65.0"

RPM_NAME = "containerized-data-importer1.65-operator-1.65.0-3.1.aarch64.rpm"
RPM_HASH = "1c96859c85e58bd87ab071b56ba9d1e8fb4919a52617ad47c4a484aa3e68a7bfde72e51b7bb7d6b0ac0ce8e915df4ccaa4058ab07c0f5ae2a3ce0d247f73f51e"

RPROVIDES:${PN} += "containerized-data-importer-1.65-operator \
containerized-data-importer-operator \
containerized-data-importer1.65-operator"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
