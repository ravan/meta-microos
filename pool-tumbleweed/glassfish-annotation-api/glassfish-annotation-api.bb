SUMMARY = "Common Annotations API Specification (JSR 250)"
DESCRIPTION = "Common Annotations APIs for the Java Platform (JSR 250)."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.3.2"

RPM_NAME = "glassfish-annotation-api-1.3.2-4.8.noarch.rpm"
RPM_HASH = "baaf5fef4e521b32a971913c2ce5b33e882f35fecd3c3a08b5152d859ac3d294d718e6ae63a45ee8a3fafc0d86a80fcdc2ebe1656a4a5fce6d614c54238f92c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-annotation-api \
mvn-javax.annotation-javax.annotation-api \
mvn-javax.annotation-javax.annotation-api-pom- \
osgi-javax.annotation-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
