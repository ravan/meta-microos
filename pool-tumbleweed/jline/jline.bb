SUMMARY = "Java library for reading and editing user input in console applications"
DESCRIPTION = "JLine is a java library for reading and editing user input in console \
applications. It features tab-completion, command history, password \
masking, customizable keybindings, and pass-through handlers to use to \
chain to other console applications."
LICENSE = "BSD-3-Clause"

PV = "2.14.6"

RPM_NAME = "jline-2.14.6-7.8.noarch.rpm"
RPM_HASH = "acddb718731e7f8f7f81ffa66402b3f95db8ae1ab1623f8599b4d5cd1ed2db16678246779cc33aa05ee8d0191274bad81b0210a4635d42b457e5682f148c80a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline \
mvn-jline-jline \
mvn-jline-jline-pom- \
osgi-jline"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.fusesource.jansi-jansi"

inherit rpm
