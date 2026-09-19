SUMMARY = "TreeLayout Core Demo"
DESCRIPTION = "Demo for 'org.abego.treelayout.core'."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "treelayout-demo-1.0.3-4.10.noarch.rpm"
RPM_HASH = "92e514e7318af18b08dffefa59b705ef9add6fb9a9a2a5f88323c0541b4cd8052d46bcd6c4d35a0e4e7bbdce98ac5622d40bc53fa2a569bf1e769d4e7068e334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.abego.treelayout-org.abego.treelayout.demo \
mvn-org.abego.treelayout-org.abego.treelayout.demo-pom- \
treelayout-demo"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.abego.treelayout-org.abego.treelayout.core"

inherit rpm
