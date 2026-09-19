SUMMARY = "XMvn Resolver"
DESCRIPTION = "This package provides XMvn Resolver, which is a very simple \
command-line tool to resolve Maven artifacts from system repositories. \
Basically it's just an interface to artifact resolution mechanism \
implemented by XMvn Core.  The primary intended use case of XMvn \
Resolver is debugging local artifact repositories."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "xmvn-resolve-4.3.0-8.1.noarch.rpm"
RPM_HASH = "6f342996cdaac07b9282dba547d8d7d5dd4d9b472c4a256ccb7616164b7c75c5385ec15139b0c107d2bcfa195c8d348dc49438ee18f4399e89bed243930084ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-resolve \
mvn-org.fedoraproject.xmvn-xmvn-resolve-pom- \
xmvn-resolve"

RDEPENDS:${PN} += "/usr/bin/bash \
beust-jcommander \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-com.beust-jcommander \
mvn-org.fedoraproject.xmvn-xmvn-api \
mvn-org.fedoraproject.xmvn-xmvn-core \
xmvn-api \
xmvn-core"

inherit rpm
