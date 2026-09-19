SUMMARY = "Controller for the data fetching service"
DESCRIPTION = "Controller for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.65.0"

RPM_NAME = "containerized-data-importer1.65-controller-1.65.0-3.1.aarch64.rpm"
RPM_HASH = "ba40ca4d09850a9e0f4f8d6ec935552b6500124291a62471d6ec4349852837eb877fde20d2c86ec7576d387b2f62c6dc98107924cbac5de4886c77958d2ae656"

RPROVIDES:${PN} += "containerized-data-importer-1.65-controller \
containerized-data-importer-controller \
containerized-data-importer1.65-controller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
