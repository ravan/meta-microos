SUMMARY = "API documentation for maven-resolver"
DESCRIPTION = "This package provides API documentation for maven-resolver."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-javadoc-2.0.22-1.1.noarch.rpm"
RPM_HASH = "f6b6471ab4c98626aa7119fadd738330cc772241ec38547fd907919072b340889231953e846bd0e9d3a67624f65e8c668f34468eae6a172855077a43e2ce4108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
