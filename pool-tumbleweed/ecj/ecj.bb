SUMMARY = "Eclipse Compiler for Java"
DESCRIPTION = "ECJ is the Java bytecode compiler of the Eclipse Platform.  It is also known as \
the JDT Core batch compiler."
LICENSE = "EPL-2.0 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "4.23"

RPM_NAME = "ecj-4.23-4.8.noarch.rpm"
RPM_HASH = "194aeb46606ae4ca3c0383908e9d02a51ae6e17374a43f4f2e071b2438358eba0cc06ab9812339fde0cb9558128317f901bbd95bbef0314d1f66ecb1ab4dea4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ecj \
mvn-org.eclipse-java10api \
mvn-org.eclipse-java9api \
mvn-org.eclipse-javax17api \
mvn-org.eclipse.jdt-core \
mvn-org.eclipse.jdt-core-pom- \
mvn-org.eclipse.jdt-ecj \
mvn-org.eclipse.jdt-ecj-pom- \
mvn-org.eclipse.jdt.core.compiler-ecj \
mvn-org.eclipse.jdt.core.compiler-ecj-pom- \
mvn-org.eclipse.tycho-org.eclipse.jdt.compiler.apt \
mvn-org.eclipse.tycho-org.eclipse.jdt.compiler.apt-pom- \
mvn-org.eclipse.tycho-org.eclipse.jdt.core \
mvn-org.eclipse.tycho-org.eclipse.jdt.core-pom- \
osgi-org.eclipse.jdt.core.compiler.batch"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem"

inherit rpm
