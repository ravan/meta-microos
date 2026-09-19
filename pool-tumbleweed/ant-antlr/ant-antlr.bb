SUMMARY = "Antlr Task for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. In theory, it is kind of like \
Make. Build description files are written in XML."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-antlr-1.10.18-1.1.noarch.rpm"
RPM_HASH = "9a24fc3cc13bd99cbb30d8b13a07a341af75d7f80ad3623c1d77b8b9d4b6b316e7b582da94268ab8c4cd65646a12cb2f112c6aeb5df4d768d94ec4762d6f507d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-antlr \
config-ant-antlr \
mvn-org.apache.ant-ant-antlr \
mvn-org.apache.ant-ant-antlr-pom-"

RDEPENDS:${PN} += "ant \
antlr \
java-headless \
javapackages-filesystem"

inherit rpm
