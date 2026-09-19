SUMMARY = "Apache OpenNLP Tools"
DESCRIPTION = "This package provides Apache OpenNLP Tools."
LICENSE = "Apache-2.0"

PV = "1.9.5"

RPM_NAME = "opennlp-tools-1.9.5-2.1.noarch.rpm"
RPM_HASH = "f8551feeb4701286dd0b1db60f91b431e03e88a606c490e72e94e69f744c1f04f985464b91773bbb27f99d53745f2d21904aa8bd5d7759a8d3b0db34dad2fdb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.opennlp-opennlp-tools \
mvn-org.apache.opennlp-opennlp-tools-pom- \
opennlp-maxent \
opennlp-tools \
osgi-org.apache.opennlp.tools"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
