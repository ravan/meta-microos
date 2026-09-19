SUMMARY = "Istack-commons Maven Mojo"
DESCRIPTION = "This package contains the istack-commons Maven Mojo."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-maven-plugin-3.0.7-8.10.noarch.rpm"
RPM_HASH = "317de3928887ae4724a7c7a8859384120f6136e07a24942a472b48f5b9e4e01908625d9ae6d45eb155cf5e5db1e48da73c3a4526bec9a485d1b4a682862bff6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons-maven-plugin \
mvn-com.sun.istack-istack-commons-maven-plugin \
mvn-com.sun.istack-istack-commons-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.codemodel-codemodel \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.resolver-maven-resolver-impl \
mvn-org.apache.maven.shared-file-management \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-io \
mvn-org.tukaani-xz"

inherit rpm
