SUMMARY = "Sisu inject"
DESCRIPTION = "This package contains Sisu inject."
LICENSE = "BSD-3-Clause & EPL-1.0 & EPL-2.0"

PV = "1.1.0"

RPM_NAME = "sisu-inject-1.1.0-2.1.noarch.rpm"
RPM_HASH = "769af57aefdb5ccfea33fe0df2a9d0e30217b62a5aa2ac6b0b84ea5049ace172ab4f9ed63e9d638f1f5d8111c4c20d5c7dc32ae28a5dc0414eff86319b05ae05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.eclipse.sisu-org.eclipse.sisu.inject \
mvn-org.eclipse.sisu-org.eclipse.sisu.inject--no-asm- \
mvn-org.eclipse.sisu-org.eclipse.sisu.inject-pom- \
mvn-org.eclipse.sisu-org.eclipse.sisu.inject-pom-no-asm- \
osgi-org.eclipse.sisu.inject \
sisu-inject"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.ow2.asm-asm"

inherit rpm
