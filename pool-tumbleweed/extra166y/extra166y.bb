SUMMARY = "Concurrency JSR-166 - Collections supporting parallel operations"
DESCRIPTION = "Implementation of Java collections supporting parallel operations using \
Fork-Join concurrent framework provided by JSR-166."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "1.7.0"

RPM_NAME = "extra166y-1.7.0-6.2.noarch.rpm"
RPM_HASH = "ea084e6e5c9891185930badba84962271fff363fb29380dd27b1800b4701f31d147995b47622687909782fb22a216ced1a15593bea0e2a0843e6d64ca4e58660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra166y \
mvn-org.codehaus.jsr166-mirror-extra166y \
mvn-org.codehaus.jsr166-mirror-extra166y-pom- \
osgi-extra166y"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
