SUMMARY = "API documentation for noggit"
DESCRIPTION = "API documentation for noggit."
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "noggit-javadoc-0.8-1.5.noarch.rpm"
RPM_HASH = "412f76fa224185040259d885eeddbabdf489486c1b28903347b578a79347525f54dd1a2880abc1e5bda9dc9c876911c7c05c5d73175b2774c374318d6c92de72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noggit-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
