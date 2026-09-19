SUMMARY = "Javadoc for modello"
DESCRIPTION = "API documentation for modello."
LICENSE = "Apache-2.0 & MIT"

PV = "2.8.1"

RPM_NAME = "modello-javadoc-2.8.1-1.1.noarch.rpm"
RPM_HASH = "775b731119c62bebac23dcb049c349bd93e70a197dedcd36b0cd50353df7e4f21db132a81f1a4608993f3ccf6909c2e2c690acb04b9964983b47de344039f423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "modello-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
