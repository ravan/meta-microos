SUMMARY = "Java Mail API"
DESCRIPTION = "The JavaMail API provides a platform-independent and protocol-independent \
framework to build mail and messaging applications."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.6.2"

RPM_NAME = "javamail-1.6.2-3.6.noarch.rpm"
RPM_HASH = "44f2294bceeead364975b5170adeeb3a12ff6e395b0255154d462292f02b94d716257ea7844c4240b58d7bef9841c7edab229844f6ffaaf6fb6196042452d804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javamail \
javamail-monolithic \
javax.mail \
mvn-com.sun.mail-all-pom- \
mvn-com.sun.mail-dsn \
mvn-com.sun.mail-dsn-pom- \
mvn-com.sun.mail-gimap \
mvn-com.sun.mail-gimap-pom- \
mvn-com.sun.mail-imap \
mvn-com.sun.mail-imap-pom- \
mvn-com.sun.mail-jakarta.mail \
mvn-com.sun.mail-jakarta.mail-pom- \
mvn-com.sun.mail-javax.mail \
mvn-com.sun.mail-javax.mail-pom- \
mvn-com.sun.mail-mailapi \
mvn-com.sun.mail-mailapi-pom- \
mvn-com.sun.mail-pop3 \
mvn-com.sun.mail-pop3-pom- \
mvn-com.sun.mail-smtp \
mvn-com.sun.mail-smtp-pom- \
mvn-javax.mail-javax.mail-api \
mvn-javax.mail-javax.mail-api-pom- \
mvn-javax.mail-mail \
mvn-javax.mail-mail-pom- \
mvn-javax.mail-mailapi \
mvn-javax.mail-mailapi-pom- \
mvn-org.eclipse.jetty.orbit-javax.mail.glassfish \
mvn-org.eclipse.jetty.orbit-javax.mail.glassfish-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.activation-activation"

inherit rpm
