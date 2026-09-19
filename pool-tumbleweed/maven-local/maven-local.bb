SUMMARY = "Local mode for Maven"
DESCRIPTION = "This meta-package pulls in macros, scripts and dependencies \
implementing local mode for Maven, which allows artifact \
resolution using XMvn resolver."
LICENSE = "BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "maven-local-6.2.0-1.9.noarch.rpm"
RPM_HASH = "417253ba5e869016bb687a10799672be3c93215919eb2a5561f35060ce4426d1879e28b91b87d9cebdd7b4c72735a196877cd6a15b4103994696b8fb7ab76457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-local"

RDEPENDS:${PN} += "javapackages-local \
javapackages-tools \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin \
mvn-org.apache.maven.plugins-maven-resources-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin \
xmvn-connector \
xmvn-install \
xmvn-minimal \
xmvn-mojo \
xmvn-resolve"

inherit rpm
