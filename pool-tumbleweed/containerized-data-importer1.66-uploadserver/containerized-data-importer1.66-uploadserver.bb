SUMMARY = "Upload server for the data fetching service"
DESCRIPTION = "Upload server for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.66.1"

RPM_NAME = "containerized-data-importer1.66-uploadserver-1.66.1-1.1.aarch64.rpm"
RPM_HASH = "766335cad507bfd3d7cf498411818dc2e39d37e86b9b9c31bd84f61fb5dcdfcb9e4243b165ec4ebee9ae831787a4b1c296301565ff66c4a9ed06d8f4113ce6b7"

RPROVIDES:${PN} += "containerized-data-importer-uploadserver \
containerized-data-importer1.66-uploadserver"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
