SUMMARY = "Javadoc for aws-sdk-java"
DESCRIPTION = "This package contains javadoc for aws-sdk-java."
LICENSE = "Apache-2.0 & LicenseRef-SUSE-Public-Domain"

PV = "1.11.3"

RPM_NAME = "aws-sdk-java-javadoc-1.11.3-12.2.noarch.rpm"
RPM_HASH = "11220882a5bacf2333deb69519304a6cd12ac76d9d9b13889e72a339d5582bab5782819f2c945a3dfbb219d3b4b892892ea02e914f2e8c23f75aeecb377906cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-sdk-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
