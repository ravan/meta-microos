SUMMARY = "Sisu Plexus Extender"
DESCRIPTION = "Plexus-JSR330 adapter; adds Plexus support to the Sisu-Inject \
container"
LICENSE = "EPL-1.0 & EPL-2.0"

PV = "1.1.0"

RPM_NAME = "sisu-plexus-extender-1.1.0-2.1.noarch.rpm"
RPM_HASH = "e13a33e76d49ae2b1db9201d24ac3575bedc7e593d08ca6ebadfbdef411eecae10171900fb45b14f6997ad7a412e2b55bfec021b1fe0b245283e0ca721bd2d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.eclipse.sisu-org.eclipse.sisu.plexus.extender \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus.extender-pom- \
osgi-org.eclipse.sisu.plexus.extender \
sisu-plexus-extender"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
