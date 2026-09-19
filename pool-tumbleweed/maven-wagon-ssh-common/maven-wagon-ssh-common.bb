SUMMARY = "The ssh-common module for maven-wagon"
DESCRIPTION = "The ssh-common module for maven-wagon"
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-ssh-common-3.5.3-2.9.noarch.rpm"
RPM_HASH = "d2fe2431ac17139b62afff41c9ba08732ff073e41d7fc0839bfc6c27247357bb6ef707e2c327709e456d310de7b3bf58aaa1e0477156aeffbb4d7d91a24f400f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-ssh-common \
mvn-org.apache.maven.wagon-wagon-ssh-common \
mvn-org.apache.maven.wagon-wagon-ssh-common-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-interactivity-api \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
