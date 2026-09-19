SUMMARY = "Upload server for the data fetching service"
DESCRIPTION = "Upload server for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.65.0"

RPM_NAME = "containerized-data-importer1.65-uploadserver-1.65.0-3.1.aarch64.rpm"
RPM_HASH = "8760387bceaa6f412ad090f950e834ecc89c6e915675a39bdb2c4e680fc34458ffcebc81a109cc805a7626eae3c84b047d984acffe41c447b8aca64d7ee3346e"

RPROVIDES:${PN} += "containerized-data-importer-1.65-uploadserver \
containerized-data-importer-uploadserver \
containerized-data-importer1.65-uploadserver"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
