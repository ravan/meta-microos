SUMMARY = "Javadoc for apiguardian"
DESCRIPTION = "API documentation for apiguardian."
LICENSE = "Apache-2.0"

PV = "1.1.2"

RPM_NAME = "apiguardian-javadoc-1.1.2-2.10.noarch.rpm"
RPM_HASH = "f1ac7a5cfe8de304a79a9cb9279b272cd160c76cb5fbbbd4ac0f63a004fb84e2ba4112b2a070c8a6169e918923f5d99977ff0ba584e6d4961516f479fcf4720f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apiguardian-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
