SUMMARY = "Sonatype OSS Parent"
DESCRIPTION = "Sonatype OSS parent pom used by other sonatype packages."
LICENSE = "Apache-2.0"

PV = "7"

RPM_NAME = "sonatype-oss-parent-7-2.19.noarch.rpm"
RPM_HASH = "bb7bdca24237756fc503df212899ef6b4e99ea48800768ac5c53d1933111e39d12c2f5c89389afd438841bb9269e2e52a41b84c5073e221d2b7d78386404b952"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.sonatype.oss-oss-parent-pom- \
sonatype-oss-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
