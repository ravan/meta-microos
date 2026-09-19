SUMMARY = "Pure Java implementation of libzmq"
DESCRIPTION = "Pure Java implementation of libzmq."
LICENSE = "MPL-2.0+"

PV = "0.5.3"

RPM_NAME = "jeromq-0.5.3-2.4.noarch.rpm"
RPM_HASH = "64778db37bd5c0a09688a4c5c9f4f1bf86b57cc7c2467b917ab2331a3de8fef768427bcdfb83835a028a7c0d65b666b41ec8c3b2ecd218f2ed92d260009ad49f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeromq \
mvn-org.zeromq-jeromq \
mvn-org.zeromq-jeromq-pom- \
osgi-org.zeromq.jeromq"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-eu.neilalexander-jnacl"

inherit rpm
