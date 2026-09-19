SUMMARY = "Kohsuke parent POM"
DESCRIPTION = "This package contains Kohsuke parent POM file."
LICENSE = "MIT"

PV = "14"

RPM_NAME = "kohsuke-pom-14-1.18.noarch.rpm"
RPM_HASH = "ea252da2824c784c8c51b41cdff3f8cb5e2edafde80ff5f25560f79be16237c38d5042285f582d2e2e9f0b006ebee203ac241c5d0e8c84658d28d6aaf46f6225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kohsuke-pom \
mvn-org.kohsuke-pom-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
