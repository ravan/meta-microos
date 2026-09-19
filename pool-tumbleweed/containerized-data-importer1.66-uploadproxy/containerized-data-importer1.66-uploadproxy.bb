SUMMARY = "Upload proxy for the data fetching service"
DESCRIPTION = "Upload proxy for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.66.1"

RPM_NAME = "containerized-data-importer1.66-uploadproxy-1.66.1-1.1.aarch64.rpm"
RPM_HASH = "92e5ef143e4f866ecd1590238550baf45fad634869a4628524b7d5a925e69f3dd94f5ffdf998b83fc77c2c4f2d6cadcfd0ec484a34e4b1b3e4765711bc2f690c"

RPROVIDES:${PN} += "containerized-data-importer-uploadproxy \
containerized-data-importer1.66-uploadproxy"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
