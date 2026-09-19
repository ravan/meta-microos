SUMMARY = "Parent POM for FuseSource Maven projects"
DESCRIPTION = "This is a shared POM parent for FuseSource Maven projects"
LICENSE = "Apache-2.0"

PV = "1.12"

RPM_NAME = "fusesource-pom-1.12-1.5.noarch.rpm"
RPM_HASH = "75e074afe6e0d8920adb550b3c7660a57889f729b1d1d87492f637beca46aa8751a9207ac177253605c27c8f20b9b29adfb2ca0aa6a6c2fba6aff83571099d9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fusesource-pom \
mvn-org.fusesource-fusesource-pom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
