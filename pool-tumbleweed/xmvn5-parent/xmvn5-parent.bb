SUMMARY = "XMvn Parent POM"
DESCRIPTION = "This package provides XMvn parent POM."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "xmvn5-parent-5.1.0-3.1.noarch.rpm"
RPM_HASH = "aec705b92ab81fb89c57bfcb0682ac48b0ba57acabd2a2a0ecfd343fdf8225a34b094f55cdb971805661b7a820b964323881a98ecc41cc4865fc0f0e9cf26477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-parent-pom-5 \
mvn-org.fedoraproject.xmvn-xmvn-parent-pom-5.1.0 \
xmvn5-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
