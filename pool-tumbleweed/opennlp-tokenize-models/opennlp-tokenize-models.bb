SUMMARY = "OpenNLP Tokenizer Models"
DESCRIPTION = "Stock OpenNLP tokenizer models trained on opennlp training data."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "opennlp-tokenize-models-1.5-2.8.noarch.rpm"
RPM_HASH = "52b423ca50a1e2840969f6b0cd48af74d866246e7763cb4f62e5d5ffefe042005deff92fd38ad2bd46a5a96bbdc0dfaa59dff8c419e4106ba6eab60afa3ed8eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-edu.washington.cs.knowitall-opennlp-tokenize-models \
mvn-edu.washington.cs.knowitall-opennlp-tokenize-models-pom- \
opennlp-tokenize-models"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
