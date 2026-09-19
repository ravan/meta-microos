SUMMARY = "AWS Java SDK for Amazon EC2"
DESCRIPTION = "The AWS Java SDK for Amazon EC2 module holds the \
client classes that are used for communicating with \
Amazon EC2 Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-ec2-1.11.3-12.2.noarch.rpm"
RPM_HASH = "84f9bf75d93494f3456868e91d6705928a53872115d516b91fb6d7fda097f0095ef74b1f70285382ca11ea088443fdc3964c05c0366663c631b120561799f4f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-ec2 \
mvn-com.amazonaws-aws-java-sdk-ec2 \
mvn-com.amazonaws-aws-java-sdk-ec2-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
