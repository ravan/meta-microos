SUMMARY = "A machine learning based toolkit for the processing of natural language text"
DESCRIPTION = "The Apache OpenNLP library is a machine learning based toolkit for the \
processing of natural language text. \
 \
It supports the most common NLP tasks, such as tokenization, sentence \
segmentation, part-of-speech tagging, named entity extraction, chunking, \
parsing, and coreference resolution. These tasks are usually required to \
build more advanced text processing services. OpenNLP also includes \
maximum entropy and perceptron based machine learning."
LICENSE = "Apache-2.0"

PV = "1.9.5"

RPM_NAME = "opennlp-1.9.5-2.1.noarch.rpm"
RPM_HASH = "93a87beeaac2ded3b8b79cab189bb83d2e87969f6ef63c3eb9b1a3b1f98362ac349e1d6d762acd1c6a9dca93fece8249a8259432f33557683bfc0d64e12b1998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.opennlp-opennlp-pom- \
opennlp"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache-apache-pom- \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin"

inherit rpm
