SUMMARY = "ParaNamer Generator"
DESCRIPTION = "This package contains the ParaNamer Generator."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-generator-2.8-4.10.noarch.rpm"
RPM_HASH = "ebf24e68928870ebba15a5d1a53c1657ec354cd190090dfd36fc0dc8c339458a982abdfc76705a9295085225ebab4adb4546240fe74a15bf1cbd37dfb33875a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.paranamer-paranamer-generator \
mvn-com.thoughtworks.paranamer-paranamer-generator-pom- \
paranamer-generator"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.qdox-qdox \
mvn-org.ow2.asm-asm"

inherit rpm
