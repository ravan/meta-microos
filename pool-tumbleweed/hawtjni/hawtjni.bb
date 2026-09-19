SUMMARY = "Code generator that produces the JNI code"
DESCRIPTION = "HawtJNI is a code generator that produces the JNI code needed to \
implement java native methods. It is based on the jnigen code generator \
that is part of the SWT Tools project which is used to generate all the \
JNI code which powers the eclipse platform."
LICENSE = "Apache-2.0 & EPL-1.0 & BSD-3-Clause"

PV = "1.18"

RPM_NAME = "hawtjni-1.18-3.1.noarch.rpm"
RPM_HASH = "a17ec9724e805f09e1505705dfba136520ed57460c9ff07f2b32b7bb09ddbdab8e855b119122c4bdd240739c6122ce508c061610a500c08957436c6077e18df2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hawtjni \
mvn-org.fusesource.hawtjni-hawtjni-generator \
mvn-org.fusesource.hawtjni-hawtjni-generator-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
apache-commons-cli \
apache-commons-lang3 \
hawtjni-runtime \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-commons-cli-commons-cli \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.xbean-xbean-finder \
mvn-org.fusesource.hawtjni-hawtjni-runtime \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-commons \
objectweb-asm \
xbean"

inherit rpm
