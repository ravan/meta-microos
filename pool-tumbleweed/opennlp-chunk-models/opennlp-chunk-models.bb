SUMMARY = "OpenNLP Chunker Models"
DESCRIPTION = "Stock OpenNLP chunker models trained on conll2000 shared task data."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "opennlp-chunk-models-1.5-2.8.noarch.rpm"
RPM_HASH = "37ba0e32657b62b1ad539dd63c2c170cca67e164d1b0f80cb7c84feb8bb8be9a9fff6edc5c4074c6b9a5dbe1163433f2be60cc1e43feb6d9ffd45c3c84a27b61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-edu.washington.cs.knowitall-opennlp-chunk-models \
mvn-edu.washington.cs.knowitall-opennlp-chunk-models-pom- \
opennlp-chunk-models"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
