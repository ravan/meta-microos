SUMMARY = "A Java API for generating .java source files"
DESCRIPTION = "A utility class which aids in generating Java source files."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "javapoet-1.13.0-1.11.noarch.rpm"
RPM_HASH = "43208749a213c15f222f18441f7d27444c8b5a1ac4d5a658976ac6f256b3fa213d31a74d2d74190a896d16b6d606c5ac877f2bdd4f2236cd7948f46fba5dd12d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javapoet \
mvn-com.squareup-javapoet \
mvn-com.squareup-javapoet-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
