SUMMARY = "API documentation for osgi-service-jdbc"
DESCRIPTION = "This package provides API documentation for osgi-service-jdbc."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "osgi-service-jdbc-javadoc-1.0.0-2.10.noarch.rpm"
RPM_HASH = "ed670b7c5bee3bc66feb19b90a94984d8d766420028f8345049912b86064a9ca929635b07d84e509f6c40f609cd3a935558c816e317ff69cbb5713bf9483ad2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-service-jdbc-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
