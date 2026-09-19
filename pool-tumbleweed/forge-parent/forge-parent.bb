SUMMARY = "Sonatype Forge Parent Pom"
DESCRIPTION = "Sonatype Forge is a community dedicated to the creation of \
development tools and technologies."
LICENSE = "Apache-2.0"

PV = "38"

RPM_NAME = "forge-parent-38-1.19.noarch.rpm"
RPM_HASH = "9a37fd84463ba62ad58103f2f7b980a489d7cf2bf0a2c3de3e887b1db3f245ff90bdd1caeef97ba9869585e910193f858609a8482a0a1cd1715f6d3a8576adea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "forge-parent \
mvn-org.sonatype.forge-forge-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
