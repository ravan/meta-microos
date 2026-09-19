SUMMARY = "Cloner for host assisted cloning"
DESCRIPTION = "Source and Target cloner image for host assisted cloning"
LICENSE = "Apache-2.0"

PV = "1.66.1"

RPM_NAME = "containerized-data-importer1.66-cloner-1.66.1-1.1.aarch64.rpm"
RPM_HASH = "373eea4cfdd02ae5f1d47d74115db5d9f24fe37e734d7aaef43b15edc567583f448a02c1059185da62c84005e57b374a026908f52fd9fb9cbd5918e44215a311"

RPROVIDES:${PN} += "containerized-data-importer-cloner \
containerized-data-importer1.66-cloner"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm
