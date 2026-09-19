SUMMARY = "API documentation for xmvn-tools"
DESCRIPTION = "This package provides API documentation for xmvn-tools."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "xmvn-tools-javadoc-4.3.0-8.1.noarch.rpm"
RPM_HASH = "56a3d4031181d85df8851306c619f76ff4be76f58e7aee18ee642200bf1f82596b43ab5b13ada5358c98b25bb5a0f5af851bd02a89c0deb687d24e3c90c5eebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn-tools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
