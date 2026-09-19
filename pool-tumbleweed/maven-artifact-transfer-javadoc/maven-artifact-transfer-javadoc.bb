SUMMARY = "API documentation for maven-artifact-transfer"
DESCRIPTION = "This package provides API documentation for maven-artifact-transfer."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "maven-artifact-transfer-javadoc-0.13.1-6.6.noarch.rpm"
RPM_HASH = "ff112aedcbef8cb8f7c154ae6018dbaf1bfb230a92f9f0883ee03e3b5deacdcb96a96a3c6b364d1d20f6d59e2247c8cff8dae6e0f6dfbe5dc02beb1fad7124df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-artifact-transfer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
