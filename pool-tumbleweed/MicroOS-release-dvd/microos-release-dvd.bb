SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "MicroOS-release-dvd-20260915-3446.1.aarch64.rpm"
RPM_HASH = "0ad7f3ce924044fc4b7b35810a2c05c64c2bd1da38886866be77dd7b7a3767d2e85b9f5f91d533e5e044333bf5888d9e5c0900c9dd345970c826e9ea9c4d4b52"

RPROVIDES:${PN} += "MicroOS-release-dvd \
flavor-dvd \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
