SUMMARY = "Split text into segments"
DESCRIPTION = "Segment program is used to split text into segments, for example sentences. \
Splitting rules are read from SRX file, which is standard format for this task."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "segment-2.0.1-2.10.noarch.rpm"
RPM_HASH = "a14b869d453a93e0eed9606ce45bc8dbf3d91d35bbeeb7307c19aab5dfc0165f6045e4ef5d8f858dca4ea0d2052101ca1ea99c405e88686106845109f23afbad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-net.loomchild-segment \
mvn-net.loomchild-segment-pom- \
segment"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging"

inherit rpm
