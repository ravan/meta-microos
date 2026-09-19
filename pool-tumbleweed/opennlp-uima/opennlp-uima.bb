SUMMARY = "Apache OpenNLP UIMA Annotators"
DESCRIPTION = "This package provides Apache OpenNLP UIMA Annotators."
LICENSE = "Apache-2.0"

PV = "1.9.5"

RPM_NAME = "opennlp-uima-1.9.5-2.1.noarch.rpm"
RPM_HASH = "0365ebe8e08202fb8e7febd39b3885f4da9f3e779e4e82871134b324582765195f45243577d75fbc628189898cf4c3c5d5d32fc075c1215ab06f1dfafd218de8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.opennlp-opennlp-uima \
mvn-org.apache.opennlp-opennlp-uima-pom- \
opennlp-uima"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.opennlp-opennlp-tools"

inherit rpm
