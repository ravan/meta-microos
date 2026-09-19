SUMMARY = "Dependency injection framework for Java 5 and above"
DESCRIPTION = "Guice alleviates the need for factories and the use of 'new' in Java \
code. Guice's @Inject is a different 'new'. Writing factories will \
still be needed in some cases, but code will not directly depend on \
them. \
 \
Guice embraces Java's type safe nature, especially when it comes to \
features introduced in Java 5 such as generics and annotations."
LICENSE = "Apache-2.0"

PV = "6.0.0"

RPM_NAME = "google-guice-6.0.0-3.6.noarch.rpm"
RPM_HASH = "c54e1955138bc91fe7e820d70018df2db2851cda19cc5f09c853fea2cf6ffc53271350e14c0610b4b5b326141365c89e16e1f1d7da341b494a8523e22a12ff00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-guice \
guice-multibindings \
mvn-com.google.inject-guice \
mvn-com.google.inject-guice--classes- \
mvn-com.google.inject-guice--no-aop- \
mvn-com.google.inject-guice-pom- \
mvn-com.google.inject-guice-pom-classes- \
mvn-com.google.inject-guice-pom-no-aop- \
mvn-org.sonatype.sisu-sisu-guice \
mvn-org.sonatype.sisu-sisu-guice--no-aop- \
mvn-org.sonatype.sisu-sisu-guice-pom- \
mvn-org.sonatype.sisu-sisu-guice-pom-no-aop- \
osgi-com.google.inject"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-aopalliance-aopalliance \
mvn-com.google.guava-guava \
mvn-jakarta.inject-jakarta.inject-api \
mvn-javax.inject-javax.inject"

inherit rpm
