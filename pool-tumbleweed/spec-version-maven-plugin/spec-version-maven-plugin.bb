SUMMARY = "Spec Version Maven Plugin"
DESCRIPTION = "Maven Plugin to configure APIs version and \
specs in a MANIFEST.MF file."
LICENSE = "EPL-2.0 | GPL-2.0-with-classpath-exception"

PV = "2.1"

RPM_NAME = "spec-version-maven-plugin-2.1-1.23.noarch.rpm"
RPM_HASH = "b9c450cefa03983f4a0afcc8b3e2d8e45079694d556b9017c2f41e60ad0972335c4e93d82e8fcc408ceda62ea35e30da4d6a3417fd04edd86a94d8f4b1865e71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.glassfish.build-spec-version-maven-plugin \
mvn-org.glassfish.build-spec-version-maven-plugin-pom- \
spec-version-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations"

inherit rpm
