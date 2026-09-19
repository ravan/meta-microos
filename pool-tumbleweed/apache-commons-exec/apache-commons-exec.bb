SUMMARY = "Java library to reliably execute external processes from within the JVM"
DESCRIPTION = "Commons Exec is a library for dealing with external process execution and \
environment management in Java."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "apache-commons-exec-1.6.0-1.3.noarch.rpm"
RPM_HASH = "85065a0340847d8621ad12149b6081db135889ae11451be38c465910a257f0d410900ad87ca50231473a6d0de0ed83c9007800f3c12136ccf68b15a48533bd30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-exec \
mvn-org.apache.commons-commons-exec \
mvn-org.apache.commons-commons-exec-pom- \
osgi-org.apache.commons.commons-exec"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
