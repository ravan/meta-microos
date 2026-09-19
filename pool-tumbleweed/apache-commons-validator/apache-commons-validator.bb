SUMMARY = "Apache Commons Validator"
DESCRIPTION = "A common issue when receiving data either electronically or from user \
input is verifying the integrity of the data. This work is repetitive \
and becomes even more complicated when different sets of validation \
rules need to be applied to the same set of data based, for example, on \
locale. Error messages may also vary by locale. This package attempts \
to address some of these issues and speed development and maintenance \
of validation rules."
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "apache-commons-validator-1.10.1-1.2.noarch.rpm"
RPM_HASH = "561dfa57978b8d33bb497e1b7e02a0beaf8b112b8c892edfb5814e3d1676df6e399142d9e33df665fd76cd46a8d2f816d0616a679007e5caee15244a23f3833e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-validator \
commons-validator \
jakarta-commons-validator \
mvn-commons-validator-commons-validator \
mvn-commons-validator-commons-validator-pom- \
mvn-org.apache.commons-commons-validator \
mvn-org.apache.commons-commons-validator-pom- \
osgi-org.apache.commons.commons-validator"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-beanutils-commons-beanutils \
mvn-commons-collections-commons-collections \
mvn-commons-digester-commons-digester \
mvn-commons-logging-commons-logging"

inherit rpm
