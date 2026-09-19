SUMMARY = "XMvn Parent POM"
DESCRIPTION = "This package provides XMvn parent POM."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "xmvn-parent-4.3.0-8.1.noarch.rpm"
RPM_HASH = "29d193366a057d2fafee08780de3ef335284aaf38f04c7b45480d97ca2699d69feb363b60ebe306c8ac50754511a2634d478499c55ad856a35949625df7ecb54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-parent-pom- \
xmvn-parent \
xmvn-parent-pom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
