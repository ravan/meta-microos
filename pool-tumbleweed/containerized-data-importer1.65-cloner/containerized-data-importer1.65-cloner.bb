SUMMARY = "Cloner for host assisted cloning"
DESCRIPTION = "Source and Target cloner image for host assisted cloning"
LICENSE = "Apache-2.0"

PV = "1.65.0"

RPM_NAME = "containerized-data-importer1.65-cloner-1.65.0-3.1.aarch64.rpm"
RPM_HASH = "fad1366cc26e0995f13c8ef1b563c76b61a72d8d828eeac54adf5dc85dda782c57e0a29bda3f544c9d29943ee297c7593ec92cea6c2008e040bbc3a679ac653e"

RPROVIDES:${PN} += "containerized-data-importer-1.65-cloner \
containerized-data-importer-cloner \
containerized-data-importer1.65-cloner"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm
