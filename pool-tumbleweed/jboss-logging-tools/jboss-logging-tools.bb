SUMMARY = "JBoss Logging I18n Annotation Processor"
DESCRIPTION = "This package contains JBoss Logging I18n Annotation Processor"
LICENSE = "Apache-2.0 & LGPL-2.0-or-later"

PV = "2.2.1"

RPM_NAME = "jboss-logging-tools-2.2.1-4.14.noarch.rpm"
RPM_HASH = "556fdfeee17e7598653183b8d82fae9bea248bc51c1d1a327c0c4ba73cfed1b23eb6acf5711771c41d916c4c8b0d89d3226731ed0096025a827cd24e63af50db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logging-tools \
mvn-org.jboss.logging-jboss-logging-annotations \
mvn-org.jboss.logging-jboss-logging-annotations-pom- \
mvn-org.jboss.logging-jboss-logging-processor \
mvn-org.jboss.logging-jboss-logging-processor-pom- \
mvn-org.jboss.logging-jboss-logging-tools-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jboss.jdeparser-jdeparser"

inherit rpm
