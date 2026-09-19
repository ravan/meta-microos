SUMMARY = "AWS Java SDK for Elastic Load Balancing"
DESCRIPTION = "The AWS Java SDK for Elastic Load Balancing module holds the \
client classes that are used for communicating with \
Elastic Load Balancing Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-elasticloadbalancing-1.11.3-12.2.noarch.rpm"
RPM_HASH = "06d6744315d0d3e6ed27263a8c4dac69f98e7f1759157a23fe1d38090b561541939736a456f961ad46e481a4b645b644d67584c9a1efc270a076ca579535f1c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-elasticloadbalancing \
mvn-com.amazonaws-aws-java-sdk-elasticloadbalancing \
mvn-com.amazonaws-aws-java-sdk-elasticloadbalancing-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
