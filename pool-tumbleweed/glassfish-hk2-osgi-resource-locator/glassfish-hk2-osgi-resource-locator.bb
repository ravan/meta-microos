SUMMARY = "HK2 OSGi resource locator bundle"
DESCRIPTION = "Hundred Kilobytes Kernel - OSGi resource locator bundle. Used by \
various API providers that rely on META-INF/services mechanism to \
locate providers."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-osgi-resource-locator-2.5.0-11.6.noarch.rpm"
RPM_HASH = "db6f4cab8e508030776a2b9589f174e0a3516e1e017482bea00e08613baefa24daf45b049244de726af2e7598c85d0bff1307ab373ffb649bd4382bfe18b3e6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-osgi-resource-locator \
mvn-org.glassfish.hk2-osgi-resource-locator \
mvn-org.glassfish.hk2-osgi-resource-locator-pom- \
osgi-org.glassfish.hk2.osgi-resource-locator \
osgi-resource-locator"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
