SUMMARY = "Module 'schema' of open-test-reporting"
DESCRIPTION = "Test reporting formats that are agnostic of testing framework \
and programming language. \
This package contains the module 'schema'."
LICENSE = "Apache-2.0"

PV = "0.1.0~M2"

RPM_NAME = "open-test-reporting-schema-0.1.0~M2-2.9.noarch.rpm"
RPM_HASH = "b1b0544501effa5f891e3aa92d24647459b231ebe53368867c0bf14354a4259091d94b39c086c58da6757c348ea2be6e08aac7cd26533505f0269c2537c6d9b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.opentest4j.reporting-open-test-reporting-schema \
mvn-org.opentest4j.reporting-open-test-reporting-schema-pom- \
open-test-reporting-schema"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
