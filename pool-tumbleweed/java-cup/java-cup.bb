SUMMARY = "LALR Parser Generator in Java"
DESCRIPTION = "java-cup is a LALR Parser Generator in Java. With v0.11, you can: * \
   use CUP in an Ant-Target \
 \
* start CUP by a simple command like java -jar java-cup-11a.jar \
   myGrammar.cup \
 \
* use generic parametrized classes (since Java 1.5) as datatypes for \
   non terminals and terminals \
 \
* have Your own symbol classes"
LICENSE = "HPND"

PV = "0.11"

RPM_NAME = "java-cup-0.11-33.10.noarch.rpm"
RPM_HASH = "8d8d73478f4a190bc0eb3c00374db627811b8ec3a33da581c6aac8d8ba051f96e527aef11c5da69df94b97870770633b9b1455d47c06b8ed9462f4ac003ef0e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-cup \
mvn-com.github.vbmacher-java-cup \
mvn-com.github.vbmacher-java-cup-runtime"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem"

inherit rpm
