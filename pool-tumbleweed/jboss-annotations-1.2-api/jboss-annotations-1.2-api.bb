SUMMARY = "Java EE Annotations 1.2 API"
DESCRIPTION = "The Java EE  Annotations 1.2 API classes."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.2"

RPM_NAME = "jboss-annotations-1.2-api-1.0.2-3.8.noarch.rpm"
RPM_HASH = "16166eeda5ef97ad42a60e3eeb3e05e761cbcd41e904fb520d29c92e7390ac03c625612a4385e1fe1962effacf64069fcd22977933c5245341d35475dc30f779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-annotations-1.2-api \
mvn-org.jboss.spec.javax.annotation-jboss-annotations-api-1.2-spec \
mvn-org.jboss.spec.javax.annotation-jboss-annotations-api-1.2-spec-pom- \
osgi-org.jboss.spec.javax.annotation.jboss-annotations-api-1.2-spec"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
