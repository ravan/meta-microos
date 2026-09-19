SUMMARY = "AWS Java SDK for Amazon Redshift"
DESCRIPTION = "The AWS Java SDK for Amazon Redshift module holds the \
client classes that are used for communicating with \
Amazon Redshift Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-redshift-1.11.3-12.2.noarch.rpm"
RPM_HASH = "1730e68eace3e6a77af640bcbc9ead12b0c84d6a8c66664c4f6314e706efc0c9d15a6252a987457ad9dd58fa558574bc16512e6364050039a95f18eaf9a167c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-redshift \
mvn-com.amazonaws-aws-java-sdk-redshift \
mvn-com.amazonaws-aws-java-sdk-redshift-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
