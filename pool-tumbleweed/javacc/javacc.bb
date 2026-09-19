SUMMARY = "A Parser and Scanner Generator for Java"
DESCRIPTION = "Java Compiler Compiler (JavaCC) is the most popular parser generator \
for use with Java applications. A parser generator is a tool that reads \
a grammar specification and converts it to a Java program that can \
recognize matches to the grammar. In addition to the parser generator \
itself, JavaCC provides other standard capabilities related to parser \
generation such as tree building (via a tool called JJTree included \
with JavaCC), actions, debugging, etc."
LICENSE = "BSD-3-Clause"

PV = "7.0.13"

RPM_NAME = "javacc-7.0.13-2.11.noarch.rpm"
RPM_HASH = "6d1a44ca0dcf0a929fe52f0481f213b0e7c582c9bf6a9c62d255ca5e0e0c1936ee3103c2113a8413dd95652830bb6d865bc037fd830ccd3ee6c53f05f007e1fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javacc \
javacc-bootstrap \
mvn-net.java.dev.javacc-javacc \
mvn-net.java.dev.javacc-javacc-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
