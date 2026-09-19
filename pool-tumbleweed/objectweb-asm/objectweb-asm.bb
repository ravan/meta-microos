SUMMARY = "Java bytecode manipulation framework"
DESCRIPTION = "ASM is a Java bytecode manipulation framework. \
 \
It can be used to dynamically generate stub classes or other proxy \
classes, directly in binary form, or to dynamically modify classes at \
load time, i.e., just before they are loaded into the Java Virtual \
Machine. \
 \
ASM offers similar functionalities as BCEL or SERP, but is much \
smaller."
LICENSE = "BSD-3-Clause"

PV = "9.10.1"

RPM_NAME = "objectweb-asm-9.10.1-1.3.noarch.rpm"
RPM_HASH = "8078368726fab641ef872b3834387f85f18cdd6470980efe36eb0d2a9069896149ad86f2b7a01b09f34e96ec3612b36644c0f355e06144f2e6cdc0717e57d3ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-all \
mvn-org.ow2.asm-asm-all-pom- \
mvn-org.ow2.asm-asm-analysis \
mvn-org.ow2.asm-asm-analysis-pom- \
mvn-org.ow2.asm-asm-commons \
mvn-org.ow2.asm-asm-commons-pom- \
mvn-org.ow2.asm-asm-debug-all \
mvn-org.ow2.asm-asm-debug-all-pom- \
mvn-org.ow2.asm-asm-pom- \
mvn-org.ow2.asm-asm-tree \
mvn-org.ow2.asm-asm-tree-pom- \
mvn-org.ow2.asm-asm-util \
mvn-org.ow2.asm-asm-util-pom- \
objectweb-asm \
osgi-org.objectweb.asm \
osgi-org.objectweb.asm.analysis \
osgi-org.objectweb.asm.commons \
osgi-org.objectweb.asm.tree \
osgi-org.objectweb.asm.util"

RDEPENDS:${PN} += "/usr/bin/bash \
java \
javapackages-filesystem \
javapackages-tools"

inherit rpm
