SUMMARY = "ANother Tool for Language Recognition (Manual)"
DESCRIPTION = "ANTLR, Another Tool for Language Recognition, (formerly PCCTS) is a \
language tool that provides a framework for constructing recognizers, \
compilers, and translators from grammatical descriptions containing C++ \
or Java actions (you can use PCCTS 1.xx to generate C-based parsers). \
 \
This package provides the Java runtime for antlr"
LICENSE = "GPL-2.0-or-later & LicenseRef-SUSE-Public-Domain & MIT"

PV = "2.7.7"

RPM_NAME = "antlr-java-2.7.7-126.4.noarch.rpm"
RPM_HASH = "9f8e500df8240545dd8610794bd17ad2237b250b4047df6d72a0ecc11700199db0403a1f5ca3623249ce3fb47e5f9f7385669d74a75e2392bba4ebcadc1dcb25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr-java \
mvn-antlr-antlr \
mvn-antlr-antlr-pom- \
mvn-antlr-antlrall \
mvn-antlr-antlrall-pom-"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
