SUMMARY = "Simple Logging Facade for Java"
DESCRIPTION = "The Simple Logging Facade for Java or (SLF4J) is intended to serve \
as a simple facade for various logging APIs allowing to the end-user \
to plug in the desired implementation at deployment time. SLF4J also \
allows for a gradual migration path away from \
Jakarta Commons Logging (JCL). \
 \
Logging API implementations can either choose to implement the \
SLF4J interfaces directly, e.g. NLOG4J or SimpleLogger. Alternatively, \
it is possible (and rather easy) to write SLF4J adapters for the given \
API implementation, e.g. Log4jLoggerAdapter or JDK14LoggerAdapter.."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.18"

RPM_NAME = "slf4j-2.0.18-1.2.noarch.rpm"
RPM_HASH = "f5f314afee8a7dae0e7f8e61a208052120a9b4983bcd1877863baeb2c9630c31edb2ff364481555820b4a81a0442e8581333f9181dfbc947b87b357d2d94cb1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.slf4j-slf4j-api \
mvn-org.slf4j-slf4j-api-pom- \
mvn-org.slf4j-slf4j-nop \
mvn-org.slf4j-slf4j-nop-pom- \
mvn-org.slf4j-slf4j-simple \
mvn-org.slf4j-slf4j-simple-pom- \
osgi-slf4j.api \
osgi-slf4j.nop \
osgi-slf4j.simple \
slf4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
