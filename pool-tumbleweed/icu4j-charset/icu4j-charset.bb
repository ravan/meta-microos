SUMMARY = "Charset converter library of icu4j"
DESCRIPTION = "Charset converter library of icu4j."
LICENSE = "BSD-3-Clause & MIT & Unicode & LicenseRef-SUSE-Public-Domain"

PV = "73.1"

RPM_NAME = "icu4j-charset-73.1-5.3.noarch.rpm"
RPM_HASH = "c5273a60a79be4d430c73c41add64423cf16fe6b61e761160c837e6eb8f7725721100fd91103807165de1ebb856625b4e0ce68a3b2de5e0c45c88342371dc7b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icu4j-charset \
mvn-com.ibm.icu-icu4j-charset \
mvn-com.ibm.icu-icu4j-charset-pom- \
osgi-com.ibm.icu.charset"

RDEPENDS:${PN} += "icu4j \
java-headless \
javapackages-filesystem \
mvn-com.ibm.icu-icu4j"

inherit rpm
