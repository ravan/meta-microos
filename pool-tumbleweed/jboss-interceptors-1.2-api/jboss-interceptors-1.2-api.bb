SUMMARY = "Java EE Interceptors 1.2 API"
DESCRIPTION = "The Java EE  Interceptors 1.2 API classes from JSR 318."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.0.1"

RPM_NAME = "jboss-interceptors-1.2-api-1.0.1-2.8.noarch.rpm"
RPM_HASH = "9e82b3c5e55905359c8bece7eceefe8d5a9c047d2aa250ca03b7a9335245403a2e4af7b300b8c6b6b5a0454b4086a0ed5ba65225083a98a186d071c6db7ff7c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-interceptors-1.2-api \
mvn-org.jboss.spec.javax.interceptor-jboss-interceptors-api-1.2-spec \
mvn-org.jboss.spec.javax.interceptor-jboss-interceptors-api-1.2-spec-pom- \
osgi-org.jboss.spec.javax.interceptor.jboss-interceptors-api-1.2-spec"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
