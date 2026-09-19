SUMMARY = "Parent pom for all Jackson components"
DESCRIPTION = "Project for parent pom for all Jackson components."
LICENSE = "Apache-2.0"

PV = "2.18.4"

RPM_NAME = "jackson-parent-2.18.4-1.2.noarch.rpm"
RPM_HASH = "c957d7e827882c083e0559b7a5132b22e7dc59e98f1baa4dbbd2fd34ac9a971f46dd341e69a8ef8a15a0eccd2105291690b635c2bd2f2ebee089b9ba31d4f294"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-parent \
mvn-com.fasterxml.jackson-jackson-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml-oss-parent-pom-"

inherit rpm
