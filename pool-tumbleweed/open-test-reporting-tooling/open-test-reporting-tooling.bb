SUMMARY = "Module 'tooling' of open-test-reporting"
DESCRIPTION = "Test reporting formats that are agnostic of testing framework \
and programming language. \
This package contains the module 'tooling'."
LICENSE = "Apache-2.0"

PV = "0.1.0~M2"

RPM_NAME = "open-test-reporting-tooling-0.1.0~M2-2.9.noarch.rpm"
RPM_HASH = "268af8bf32a3ea0b05d6251e1ad1337cf9b45263f09c72109cedf5932d2b457c7f48c3ee8c9c556a06c69082275fd0947e8e2d87ca5ce9fb9661467825f8fb9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.opentest4j.reporting-open-test-reporting-tooling \
mvn-org.opentest4j.reporting-open-test-reporting-tooling-pom- \
open-test-reporting-tooling"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.opentest4j.reporting-open-test-reporting-events \
mvn-org.opentest4j.reporting-open-test-reporting-schema"

inherit rpm
