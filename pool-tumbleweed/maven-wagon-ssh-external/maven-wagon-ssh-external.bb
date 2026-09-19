SUMMARY = "The ssh-external module for maven-wagon"
DESCRIPTION = "The ssh-external module for maven-wagon"
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-ssh-external-3.5.3-2.9.noarch.rpm"
RPM_HASH = "472751a93ab0dc779b0d2fe3691cf1c8ecc940187031a50c25d1de2f39c7f75c64823b7823a7dbf58ccd64617379b7d6b0511db5f51c4e2c61ae1311e78ff2df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-ssh-external \
mvn-org.apache.maven.wagon-wagon-ssh-external \
mvn-org.apache.maven.wagon-wagon-ssh-external-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.apache.maven.wagon-wagon-ssh-common \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
