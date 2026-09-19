SUMMARY = "Jetty toolchain artifact remote resources"
DESCRIPTION = "Jetty toolchain artifact remote resources"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.2"

RPM_NAME = "jetty-artifact-remote-resources-1.2-4.4.noarch.rpm"
RPM_HASH = "f50d1885d4d86ce422e70061acfe490808ba9d62df2ca2a3c7a8d10c707c5d3e6747114791e2fc586747a374138dbae1def28de805b147118a9bde21e8eb8965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-artifact-remote-resources \
mvn-org.eclipse.jetty.toolchain-jetty-artifact-remote-resources \
mvn-org.eclipse.jetty.toolchain-jetty-artifact-remote-resources-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
