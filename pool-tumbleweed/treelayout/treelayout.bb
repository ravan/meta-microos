SUMMARY = "Efficient and customizable Tree Layout Algorithm in Java"
DESCRIPTION = "Efficiently create compact, highly customizable \
tree layouts. The software builds tree layouts \
in linear time. I.e. even trees with many nodes \
are built fast."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "treelayout-1.0.3-4.10.noarch.rpm"
RPM_HASH = "c785b2895062cfa7201e29f0ec827975d728f43f6dcf5ec2c329eefc014c2a46018884792510f50266eaef984753c23ffdbd20a1ace6f29b97feb6fea49a3c82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.abego.treelayout-org.abego.treelayout.core \
mvn-org.abego.treelayout-org.abego.treelayout.core-pom- \
osgi-org.abego.treelayout.core \
treelayout"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
