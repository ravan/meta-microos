SUMMARY = "Jetty toolchain artifact for distribution remote resources"
DESCRIPTION = "Jetty toolchain artifact for distribution remote distribution resources"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.2"

RPM_NAME = "jetty-distribution-remote-resources-1.2-3.4.noarch.rpm"
RPM_HASH = "221dc091db396f03664e204f78f1c1a1dff5f014e6ed967d6eb33b0bb405b573cfea0ed258ff4a881a15cffeed2435a1194ab5549d8d65ff6a881df907fb8411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-distribution-remote-resources \
mvn-org.eclipse.jetty.toolchain-jetty-distribution-remote-resources \
mvn-org.eclipse.jetty.toolchain-jetty-distribution-remote-resources-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
