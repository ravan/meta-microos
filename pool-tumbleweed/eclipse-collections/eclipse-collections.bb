SUMMARY = "Collections framework for Java"
DESCRIPTION = "Eclipse Collections is a comprehensive collections library for Java. The \
library enables productivity and performance by delivering an expressive and \
efficient set of APIs and types. The iteration protocol was inspired by the \
Smalltalk collection framework, and the collections are compatible with the \
Java Collection Framework types. \
 \
Eclipse Collections is compatible with Java 8+. Eclipse Collections is a part \
of the OpenJDK Quality Outreach program, and it is validated for different \
versions of the OpenJDK."
LICENSE = "BSD-3-Clause & EPL-1.0"

PV = "12.0.0"

RPM_NAME = "eclipse-collections-12.0.0-1.4.noarch.rpm"
RPM_HASH = "1cc8ad814f59f2f497d27321bab7685a1c02960e4ed857ef8366b6d5f8dd2f92fdd1985d4f0867361d99e202aef46676279d9b7a6e712da516e0094315ac4743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-collections \
mvn-org.eclipse.collections-eclipse-collections \
mvn-org.eclipse.collections-eclipse-collections-api \
mvn-org.eclipse.collections-eclipse-collections-api-pom- \
mvn-org.eclipse.collections-eclipse-collections-code-generator \
mvn-org.eclipse.collections-eclipse-collections-code-generator-maven-plugin \
mvn-org.eclipse.collections-eclipse-collections-code-generator-maven-plugin-pom- \
mvn-org.eclipse.collections-eclipse-collections-code-generator-pom- \
mvn-org.eclipse.collections-eclipse-collections-forkjoin \
mvn-org.eclipse.collections-eclipse-collections-forkjoin-pom- \
mvn-org.eclipse.collections-eclipse-collections-parent-pom- \
mvn-org.eclipse.collections-eclipse-collections-pom- \
mvn-org.eclipse.collections-eclipse-collections-testutils \
mvn-org.eclipse.collections-eclipse-collections-testutils-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-junit-junit \
mvn-org.antlr-ST4"

inherit rpm
