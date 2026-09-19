SUMMARY = "HK2 Run Level Service"
DESCRIPTION = "Hundred Kilobytes Kernel Run Level Service."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-runlevel-2.5.0-11.6.noarch.rpm"
RPM_HASH = "6985787152e0610427f2741e0858d2490fa6ab9c740699c303b7396d25a60d9e706772207cccd2db39f9185758593906341cb05f4b2e056c1e05f766ab75f068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-runlevel \
mvn-org.glassfish.hk2-hk2-runlevel \
mvn-org.glassfish.hk2-hk2-runlevel-pom- \
osgi-org.glassfish.hk2.runlevel"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.annotation-javax.annotation-api \
mvn-org.glassfish.hk2-hk2-api \
mvn-org.glassfish.hk2-hk2-locator"

inherit rpm
