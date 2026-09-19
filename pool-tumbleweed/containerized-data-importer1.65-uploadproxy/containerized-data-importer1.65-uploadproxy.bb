SUMMARY = "Upload proxy for the data fetching service"
DESCRIPTION = "Upload proxy for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.65.0"

RPM_NAME = "containerized-data-importer1.65-uploadproxy-1.65.0-3.1.aarch64.rpm"
RPM_HASH = "4e1c5465d76637b7361b0860eba4b155db1489e03790625302f0855de3446c81bf80801360ce587d6ee5fe15b64f3c64ca3bf505d5f117350274711aa2bbf2ea"

RPROVIDES:${PN} += "containerized-data-importer-1.65-uploadproxy \
containerized-data-importer-uploadproxy \
containerized-data-importer1.65-uploadproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
