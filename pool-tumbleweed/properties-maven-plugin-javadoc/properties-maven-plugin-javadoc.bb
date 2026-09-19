SUMMARY = "API documentation for properties-maven-plugin"
DESCRIPTION = "API documentation for properties-maven-plugin."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "properties-maven-plugin-javadoc-1.1.0-1.4.noarch.rpm"
RPM_HASH = "a17f2bd85425fb23f0160444f86489d1a1e4d54b211f70584e94dfc715ec8694bb3d66cebccb7586203ef83f2ca9aa9336c0e8cd53a6602373a73191e5dba956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "properties-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
