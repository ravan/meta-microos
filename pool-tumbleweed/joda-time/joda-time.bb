SUMMARY = "Java date and time API"
DESCRIPTION = "Joda-Time provides a quality replacement for the Java date \
and time classes. The design allows for multiple calendar \
systems, while still providing a simple API. The 'default' \
calendar is the ISO8601 standard which is used by XML. The \
Gregorian, Julian, Buddhist, Coptic and Ethiopic systems \
are also included, and we welcome further additions. \
Supporting classes include time zone, duration, format \
and parsing."
LICENSE = "Apache-2.0"

PV = "2.12.7"

RPM_NAME = "joda-time-2.12.7-1.8.noarch.rpm"
RPM_HASH = "1a7821a2cdd537f1001418c505aa194cc4dae2f0082b02cfeec5d50adf0b9dbab45ed2d9f1008963c9f1ade8df06b8e904a18a3b1a792919ba960c813d2481f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "joda-time \
mvn-joda-time-joda-time \
mvn-joda-time-joda-time-pom- \
osgi-joda-time"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
