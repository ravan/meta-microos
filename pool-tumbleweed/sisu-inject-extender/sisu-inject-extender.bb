SUMMARY = "Sisu Inject Extender"
DESCRIPTION = "Automatically discovers and wires JSR-330 annotated Sisu \
components contained in OSGi bundles"
LICENSE = "EPL-1.0 & EPL-2.0"

PV = "1.1.0"

RPM_NAME = "sisu-inject-extender-1.1.0-2.1.noarch.rpm"
RPM_HASH = "923fe7c38a54b10fb57dda300c9bff882a7b6af0f99c821e7b5555bf9c9af52517b11ed4b3888c3a72d2ae6c9d275984fc37c62a53a076a7a2e57565f0db7dee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.eclipse.sisu-org.eclipse.sisu.inject.extender \
mvn-org.eclipse.sisu-org.eclipse.sisu.inject.extender-pom- \
osgi-org.eclipse.sisu.inject.extender \
sisu-inject-extender"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
