SUMMARY = "A tool for static analysis to look for bugs in Java code"
DESCRIPTION = "SpotBugs is the spiritual successor of FindBugs, carrying on from the point \
where it left off with support of its community."
LICENSE = "LGPL-2.1-only"

PV = "4.9.8"

RPM_NAME = "spotbugs-4.9.8-1.2.noarch.rpm"
RPM_HASH = "a6a1d56ede67e0fc1c0419088e786b5b671490d5553cac05fe6913ec16ef84d091107b1059548720c26fd287f8d88f15befe2b707c52cd8d3199ab94bf713e39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.github.spotbugs-spotbugs \
mvn-com.github.spotbugs-spotbugs-pom- \
spotbugs"

RDEPENDS:${PN} += "/usr/bin/sh \
hicolor-icon-theme \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-com.github.spotbugs-spotbugs-annotations \
mvn-com.google.code.gson-gson \
mvn-net.jcip-jcip-annotations \
mvn-net.sf.saxon-Saxon-HE \
mvn-org.apache.bcel-bcel \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.commons-commons-text \
mvn-org.apache.logging.log4j-log4j-api \
mvn-org.apache.logging.log4j-log4j-core \
mvn-org.apache.logging.log4j-log4j-slf4j-impl \
mvn-org.dom4j-dom4j \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-analysis \
mvn-org.ow2.asm-asm-commons \
mvn-org.ow2.asm-asm-tree \
mvn-org.ow2.asm-asm-util \
mvn-org.slf4j-slf4j-api \
update-desktop-files"

inherit rpm
