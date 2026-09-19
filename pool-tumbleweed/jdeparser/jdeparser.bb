SUMMARY = "Source generator library for Java"
DESCRIPTION = "This project is a fork of Sun's (now Oracle's) com.sun.codemodel project. We \
decided to fork the project because by all evidence, the upstream project is \
dead and not actively accepting outside contribution. All JBoss projects are \
urged to use this project instead for source code generation."
LICENSE = "Apache-2.0"

PV = "2.0.3"

RPM_NAME = "jdeparser-2.0.3-2.14.noarch.rpm"
RPM_HASH = "092c1022cde6b2fefd690da8996bf43bff02947fe84c10fe78ac44ac62f3704f8ff36d15fe2242c1300354a323102b6d32fb173e4ea40d216e75aef9a41aefff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdeparser \
mvn-org.jboss.jdeparser-jdeparser \
mvn-org.jboss.jdeparser-jdeparser-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
