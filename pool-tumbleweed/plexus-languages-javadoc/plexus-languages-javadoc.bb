SUMMARY = "API documentation for plexus-languages"
DESCRIPTION = "API documentation for plexus-languages."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "plexus-languages-javadoc-1.5.0-1.5.noarch.rpm"
RPM_HASH = "59b278475ae88e42f9996a694b34560ff4e4373c80494efb8c8f36b26b685ff1a2462dcd7882331cf8e9680c219001b724908ee3efe3cf7ae5c4fbf526c0c920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-languages-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
