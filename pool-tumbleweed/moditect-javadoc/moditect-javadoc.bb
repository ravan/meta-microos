SUMMARY = "API documentation for moditect"
DESCRIPTION = "API documentation for moditect."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "moditect-javadoc-1.3.0-1.5.noarch.rpm"
RPM_HASH = "7cf27c6f9a6e90e91ffdb27d999f994933b7ac350cdef0df0d3fea37ed66453eb6980544f7198ff5c1b29abaf705cb7a0a2b4e48aa0bd03a7eb1ff5bc3373353"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "moditect-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
