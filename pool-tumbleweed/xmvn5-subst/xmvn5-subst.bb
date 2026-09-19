SUMMARY = "XMvn5 Subst"
DESCRIPTION = "This package provides XMvn5 Subst, which is a tool that can substitute \
Maven artifact files with symbolic links to corresponding files in \
artifact repository."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "xmvn5-subst-5.1.0-3.1.noarch.rpm"
RPM_HASH = "bce685228a279f086de38dfc066d1bf8e5a5097c511bf56f2a3b152ba502845ce37892becfbcb7a8e18ff212b2b3f90098a96cfc86029ea12aa527955ebbd4d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-subst-5 \
mvn-org.fedoraproject.xmvn-xmvn-subst-5.1.0 \
mvn-org.fedoraproject.xmvn-xmvn-subst-pom-5 \
mvn-org.fedoraproject.xmvn-xmvn-subst-pom-5.1.0 \
xmvn5-subst"

RDEPENDS:${PN} += "/usr/bin/bash \
java \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-info.picocli-picocli \
mvn-org.fedoraproject.xmvn-xmvn-api-5.1.0 \
mvn-org.fedoraproject.xmvn-xmvn-core-5.1.0 \
xmvn5-api \
xmvn5-core"

inherit rpm
