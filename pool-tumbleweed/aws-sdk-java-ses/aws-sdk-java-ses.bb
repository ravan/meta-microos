SUMMARY = "AWS Java SDK for Amazon SES"
DESCRIPTION = "The AWS Java SDK for Amazon SES module holds the \
client classes that are used for communicating with \
Amazon Simple Email Service."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-ses-1.11.3-12.2.noarch.rpm"
RPM_HASH = "d0d7af07209d1befa3c57375f2d441411c7d8102f6ad25b07f4f92444177c3f3778e9c56218f87783cc40c177bc267b162a6ccae5482296fc56dac97a21eebd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-ses \
mvn-com.amazonaws-aws-java-sdk-ses \
mvn-com.amazonaws-aws-java-sdk-ses-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.amazonaws-aws-java-sdk-core"

inherit rpm
