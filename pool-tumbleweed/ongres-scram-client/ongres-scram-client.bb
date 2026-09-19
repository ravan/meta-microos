SUMMARY = "Client for ongres-scram"
DESCRIPTION = "This package contains the client for ongres-scram"
LICENSE = "BSD-2-Clause"

PV = "3.2"

RPM_NAME = "ongres-scram-client-3.2-7.3.noarch.rpm"
RPM_HASH = "6d9463cc54d6145bf6cabafc617d5a99b55e4ee2d5fd9a4bea77606115e6c86703b99f559a0de2c7171221dad6355e8cab1e77cd4e834fbcce274ee2aa1f5425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.ongres.scram-scram-client \
mvn-com.ongres.scram-scram-client-pom- \
ongres-scram-client"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.ongres.scram-scram-common"

inherit rpm
