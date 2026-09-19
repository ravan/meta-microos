SUMMARY = "Apache OpenNLP Morfologik Addon"
DESCRIPTION = "This package provides Apache OpenNLP Morfologik Addon."
LICENSE = "Apache-2.0"

PV = "1.9.5"

RPM_NAME = "opennlp-morfologik-addon-1.9.5-2.1.noarch.rpm"
RPM_HASH = "fbde80c6afbcc4f1264ce185b4e0d2524c8a3a935e36b04aeacc22d98ab38872b65ded7fcbd067984518464eb9ace75329f8b7943fea8d36d12116ad7bf91e13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.opennlp-opennlp-morfologik-addon \
mvn-org.apache.opennlp-opennlp-morfologik-addon-pom- \
opennlp-morfologik-addon"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.opennlp-opennlp-tools \
mvn-org.carrot2-morfologik-stemming \
mvn-org.carrot2-morfologik-tools"

inherit rpm
