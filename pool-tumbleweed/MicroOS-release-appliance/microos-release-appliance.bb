SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "MicroOS-release-appliance-20260915-3446.1.aarch64.rpm"
RPM_HASH = "ae047fd137d09315f6838176f5b5d3399fdde67914ebabaf9fc2d5f91019500b21f78b07b4ff01febe37a9dd47ab55d0baa8db19569f82fa8e494f6251eeae2d"

RPROVIDES:${PN} += "MicroOS-release-appliance \
flavor-appliance \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
