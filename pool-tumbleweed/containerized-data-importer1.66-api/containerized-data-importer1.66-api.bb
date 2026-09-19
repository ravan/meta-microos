SUMMARY = "CDI API server"
DESCRIPTION = "The containerized-data-importer-api package provides the kubernetes API extension for CDI"
LICENSE = "Apache-2.0"

PV = "1.66.1"

RPM_NAME = "containerized-data-importer1.66-api-1.66.1-1.1.aarch64.rpm"
RPM_HASH = "3643ad5063cc9c057cb18e8f3d7ab0b7e6e858889a81269f5af4d5377e59c9be5e53da89c9f5933f4d587e2167ceb1d6e4e36752d24b7fd1da64e6a1b8ef557c"

RPROVIDES:${PN} += "containerized-data-importer-api \
containerized-data-importer1.66-api"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
