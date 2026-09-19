SUMMARY = "Jetty Toolchain main POM file"
DESCRIPTION = "Jetty Toolchain main POM file"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.7"

RPM_NAME = "jetty-toolchain-1.7-1.29.noarch.rpm"
RPM_HASH = "0b9ba3f28a1c152718c026d2fd40eed461fe12795ed0ce4bcd3d214b1ef0dce0cb4c4d0204a707753835b23cc43003da7475cef9d7967985a109b3c51f5b23f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-toolchain \
mvn-org.eclipse.jetty.toolchain-jetty-toolchain-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
