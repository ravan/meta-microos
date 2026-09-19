SUMMARY = "Commons Daemon - Controlling of Java Daemons"
DESCRIPTION = "The Daemon Component contains a set of Java and native code, including \
a set of Java interfaces applications must implement and Unix native \
code to control a Java daemon from a Unix operating system."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "apache-commons-daemon-1.6.1-1.3.aarch64.rpm"
RPM_HASH = "878c998d3558f4b138448160d31814bf1948feb2011a310a7fa2ee2f915c81c7feae79f766dc2de3a98df7eaed5c31df2be07105ce2ae92c66532e1a224ffece"

RPROVIDES:${PN} += "apache-commons-daemon \
jakarta-commons-daemon \
jakarta-commons-daemon-java \
mvn-commons-daemon-commons-daemon \
mvn-commons-daemon-commons-daemon-pom- \
mvn-org.apache.commons-commons-daemon \
mvn-org.apache.commons-commons-daemon-pom- \
osgi-org.apache.commons.commons-daemon"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
