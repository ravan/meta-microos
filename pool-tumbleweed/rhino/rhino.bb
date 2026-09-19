SUMMARY = "JavaScript for Java"
DESCRIPTION = "Rhino is an open-source implementation of JavaScript written entirely \
in Java. It is typically embedded into Java applications to provide \
scripting to end users."
LICENSE = "MPL-2.0"

PV = "1.7.15.1"

RPM_NAME = "rhino-1.7.15.1-1.5.noarch.rpm"
RPM_HASH = "1785b5527fb5ad12d090544af8a5697b84471f6db17531b9d68acb039a011fc1a0b14eedc26c024ae0d5eefc599a62396b7191dc5eb90f4b16debc6f4808294d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.mozilla-rhino \
mvn-org.mozilla-rhino-pom- \
mvn-rhino-js \
mvn-rhino-js-pom- \
osgi-org.mozilla.rhino \
rhino"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
