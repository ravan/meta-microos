SUMMARY = "Java-based dependency manager"
DESCRIPTION = "Apache Ivy is a tool for managing (recording, tracking, resolving and \
reporting) project dependencies.  It is designed as process agnostic and is \
not tied to any methodology or structure. while available as a standalone \
tool, Apache Ivy works particularly well with Apache Ant providing a number \
of powerful Ant tasks ranging from dependency resolution to dependency \
reporting and publication."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "apache-ivy-2.6.0-1.1.noarch.rpm"
RPM_HASH = "b3e74c079f96b20b16888ebeda1fec518afaed873c10614b21c2a57982df518896c621118050343a53965353a8bbc57e42ab49f9da4af6b88670a7a34eef37b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-ivy \
config-apache-ivy \
ivy \
mvn-org.apache.ivy-ivy \
mvn-org.apache.ivy-ivy-pom- \
osgi-org.apache.ivy"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem"

inherit rpm
