SUMMARY = "AWS Java SDK for AWS OpsWorks"
DESCRIPTION = "The AWS Java SDK for AWS OpsWorks module holds the \
client classes that are used for communicating with \
AWS OpsWorks Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-opsworks-1.11.3-12.2.noarch.rpm"
RPM_HASH = "fa3a2c41b3794a0aeb5b2c0611cdf0ce3174d9bfa1b4f46ccd6c5ab7a61656980b24a72f387d2d641bc308c1056e57aa11a8a651cfacda869909af39455522f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-opsworks \
mvn-com.amazonaws-aws-java-sdk-opsworks \
mvn-com.amazonaws-aws-java-sdk-opsworks-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
