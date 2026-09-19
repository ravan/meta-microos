SUMMARY = "POM-only artifacts for netty"
DESCRIPTION = "POM-only artifacts for netty."
LICENSE = "Apache-2.0"

PV = "4.1.136"

RPM_NAME = "netty-bom-4.1.136-1.1.noarch.rpm"
RPM_HASH = "d853aa8e504bec0d73e2094e50149bbdfe78b4cb758a796687d7df90c059e13268aa4cd777b2ff74e904f05c746bf06a90ea26bdd683b15ca574faf327beed52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.netty-netty-bom-pom- \
netty-bom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
