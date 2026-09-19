SUMMARY = "OpenNLP Postag Models"
DESCRIPTION = "Stock OpenNLP postag models. Maxent model with tag dictionary."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "opennlp-postag-models-1.5-2.8.noarch.rpm"
RPM_HASH = "f33018f26a8d7d60ee7067e7f4e04fdc893e605d2b4b7c43db1cd139a56de6d9248e3a35bfa0e7b9f4426f23227a23fd41056f1853f9c77613aed7ab47395d4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-edu.washington.cs.knowitall-opennlp-postag-models \
mvn-edu.washington.cs.knowitall-opennlp-postag-models-pom- \
opennlp-postag-models"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
