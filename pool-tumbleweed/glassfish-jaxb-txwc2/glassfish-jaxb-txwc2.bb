SUMMARY = "TXW2 Compiler"
DESCRIPTION = "JAXB schema generator. The tool to generate XML schema based on java \
classes."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-txwc2-2.3.1-12.4.noarch.rpm"
RPM_HASH = "96c85d035259de25fc3f549b27dc71444f7af2780c6e403e6dfa75871c0b7eaab675859fe8da7e77205bdde135f105d7f42b1e4bce8f28aed85cf7b1bb13ef70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-txwc2 \
mvn-org.glassfish.jaxb-txwc2 \
mvn-org.glassfish.jaxb-txwc2-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-args4j-args4j \
mvn-com.sun.xml.bind.external-rngom \
mvn-org.glassfish.jaxb-codemodel \
mvn-org.glassfish.jaxb-txw2 \
mvn-org.glassfish.jaxb-xsom"

inherit rpm
