SUMMARY = "API documentation for osgi-service-subsystem"
DESCRIPTION = "This package provides API documentation for osgi-service-subsystem."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "osgi-service-subsystem-javadoc-1.1.0-1.8.noarch.rpm"
RPM_HASH = "188ddb122ebfbe682ef65239199b0fcc0b652cc98b3550c1bd36f3702b233ba8ffb55e8ca8685d6687f34d4ba78df0afea1d26eb864b8ff84d5e27d6f7f6c7d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-service-subsystem-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
