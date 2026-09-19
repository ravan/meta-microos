SUMMARY = "Common API for doing SCM operations"
DESCRIPTION = "Maven SCM supports Maven plugins (e.g. maven-release-plugin) and other \
tools (e.g. Continuum) in providing them a common API for doing SCM operations."
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-scm-2.2.1-1.6.noarch.rpm"
RPM_HASH = "94e557a4feba9cd73a6ae4914ad8adc7f011b47297413aaccf2d0ca53db416a54b9ac0b9abad309c78f76ec9a69a61ba66def228e42068fef5979b7010095e97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-scm \
mvn-org.apache.maven.plugins-maven-scm-plugin \
mvn-org.apache.maven.plugins-maven-scm-plugin-pom- \
mvn-org.apache.maven.scm-maven-scm-api \
mvn-org.apache.maven.scm-maven-scm-api-pom- \
mvn-org.apache.maven.scm-maven-scm-client \
mvn-org.apache.maven.scm-maven-scm-client-pom- \
mvn-org.apache.maven.scm-maven-scm-manager-plexus \
mvn-org.apache.maven.scm-maven-scm-manager-plexus-pom- \
mvn-org.apache.maven.scm-maven-scm-managers-pom- \
mvn-org.apache.maven.scm-maven-scm-pom- \
mvn-org.apache.maven.scm-maven-scm-provider-git-commons \
mvn-org.apache.maven.scm-maven-scm-provider-git-commons-pom- \
mvn-org.apache.maven.scm-maven-scm-provider-gitexe \
mvn-org.apache.maven.scm-maven-scm-provider-gitexe-pom- \
mvn-org.apache.maven.scm-maven-scm-provider-hg \
mvn-org.apache.maven.scm-maven-scm-provider-hg-pom- \
mvn-org.apache.maven.scm-maven-scm-provider-jgit \
mvn-org.apache.maven.scm-maven-scm-provider-jgit-pom- \
mvn-org.apache.maven.scm-maven-scm-provider-local \
mvn-org.apache.maven.scm-maven-scm-provider-local-pom- \
mvn-org.apache.maven.scm-maven-scm-provider-svn-commons \
mvn-org.apache.maven.scm-maven-scm-provider-svn-commons-pom- \
mvn-org.apache.maven.scm-maven-scm-provider-svnexe \
mvn-org.apache.maven.scm-maven-scm-provider-svnexe-pom- \
mvn-org.apache.maven.scm-maven-scm-providers-git-pom- \
mvn-org.apache.maven.scm-maven-scm-providers-pom- \
mvn-org.apache.maven.scm-maven-scm-providers-standard-pom- \
mvn-org.apache.maven.scm-maven-scm-providers-svn-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.inject-guice--no-aop- \
mvn-commons-io-commons-io \
mvn-javax.inject-javax.inject \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.commons-commons-text \
mvn-org.apache.maven.shared-file-management \
mvn-org.codehaus.plexus-plexus-classworlds \
mvn-org.codehaus.plexus-plexus-interactivity-api \
mvn-org.codehaus.plexus-plexus-sec-dispatcher \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.eclipse.jgit-org.eclipse.jgit \
mvn-org.eclipse.jgit-org.eclipse.jgit.ssh.apache \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus \
mvn-org.slf4j-jcl-over-slf4j \
mvn-org.slf4j-slf4j-api"

inherit rpm
