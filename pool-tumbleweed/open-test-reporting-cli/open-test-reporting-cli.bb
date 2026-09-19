SUMMARY = "Module 'cli' of open-test-reporting"
DESCRIPTION = "Test reporting formats that are agnostic of testing framework \
and programming language. \
This package contains the module 'cli'."
LICENSE = "Apache-2.0"

PV = "0.1.0~M2"

RPM_NAME = "open-test-reporting-cli-0.1.0~M2-2.9.noarch.rpm"
RPM_HASH = "4c3dc4bdac49d093d5f1b94c3a4470e4e1a84f480b48188f7b7d6d166973c2976756553bae6479a85198e6fe291310ed369df9c7ba85d5d97b8e11db8dd922ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.opentest4j.reporting-open-test-reporting-cli \
mvn-org.opentest4j.reporting-open-test-reporting-cli-pom- \
open-test-reporting-cli"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-info.picocli-picocli \
mvn-org.opentest4j.reporting-open-test-reporting-events \
mvn-org.opentest4j.reporting-open-test-reporting-tooling \
mvn-org.slf4j-slf4j-api"

inherit rpm
