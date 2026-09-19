SUMMARY = "AWS Java SDK for Amazon CloudSearch"
DESCRIPTION = "The AWS Java SDK for Amazon CloudSearch module holds the \
client classes that are used for communicating with \
Amazon CloudSearch Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-cloudsearch-1.11.3-12.2.noarch.rpm"
RPM_HASH = "8d9eea373e38c278ed0a3b102a0c75ead9778afca46055d651c384a2de09fbb72a9112404a4183cc7827073b6b8becd14313c6a4e2e356aa0044108c61c737d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-cloudsearch \
mvn-com.amazonaws-aws-java-sdk-cloudsearch \
mvn-com.amazonaws-aws-java-sdk-cloudsearch-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
