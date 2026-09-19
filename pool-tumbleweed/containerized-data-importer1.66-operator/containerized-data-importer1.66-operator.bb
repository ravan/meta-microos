SUMMARY = "Operator for the data fetching service"
DESCRIPTION = "Operator for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.66.1"

RPM_NAME = "containerized-data-importer1.66-operator-1.66.1-1.1.aarch64.rpm"
RPM_HASH = "4f83154341dca7dbcacfa1779b4bc28a6eaae174ef64088470f8307c3a06435314a4eb3a40670d6a38dcefff8dae3bd1ead21bafea329663af803f4c3e9b148a"

RPROVIDES:${PN} += "containerized-data-importer-operator \
containerized-data-importer1.66-operator"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
