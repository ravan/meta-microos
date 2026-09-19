SUMMARY = "Controller for the data fetching service"
DESCRIPTION = "Controller for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.66.1"

RPM_NAME = "containerized-data-importer1.66-controller-1.66.1-1.1.aarch64.rpm"
RPM_HASH = "ff809fcfd04163a239465d05026d9db19c7f7f083410fa816200a69d8f4f353075778d9d77b2d951e1b1358b31942c918280e8c59f4b120f7a6d0a0f361f300d"

RPROVIDES:${PN} += "containerized-data-importer-controller \
containerized-data-importer1.66-controller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
