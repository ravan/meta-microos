SUMMARY = "AWS Java SDK for AWS WAF"
DESCRIPTION = "The AWS Java SDK for AWS WAF Service module holds the \
client classes that are used for communicating with \
AWS WAF Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-waf-1.11.3-12.2.noarch.rpm"
RPM_HASH = "96842f413b54695227566df203fb59c8c678a9a8621f5629fbb167f062861228470b92c32d34777c576511a85ecdcc34cd6badb6ca3e26f8026d658f81dd1676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-waf \
mvn-com.amazonaws-aws-java-sdk-waf \
mvn-com.amazonaws-aws-java-sdk-waf-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
