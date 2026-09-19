SUMMARY = "Use HawtJNI from a maven plugin"
DESCRIPTION = "HawtJNI is a code generator that produces the JNI code needed to \
implement java native methods. It is based on the jnigen code generator \
that is part of the SWT Tools project which is used to generate all the \
JNI code which powers the eclipse platform. \
 \
This package allows to use HawtJNI from a maven plugin."
LICENSE = "Apache-2.0 & EPL-1.0 & BSD-3-Clause"

PV = "1.18"

RPM_NAME = "hawtjni-maven-plugin-1.18-3.1.noarch.rpm"
RPM_HASH = "b4cbeba4590a970d67717f6ca4c2b56c2a94cf144186ed533d97a272bfea05cc3fbda198c13c87f5aa3c477ac5398a7b69ad9aeaff11737e4962e0f182348f61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hawtjni-maven-plugin \
mvn-org.fusesource.hawtjni-hawtjni-maven-plugin \
mvn-org.fusesource.hawtjni-hawtjni-maven-plugin-pom- \
mvn-org.fusesource.hawtjni-maven-hawtjni-plugin \
mvn-org.fusesource.hawtjni-maven-hawtjni-plugin-pom-"

RDEPENDS:${PN} += "autoconf \
automake \
gcc \
java-headless \
javapackages-filesystem \
libtool \
make \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-io \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.fusesource.hawtjni-hawtjni-generator"

inherit rpm
