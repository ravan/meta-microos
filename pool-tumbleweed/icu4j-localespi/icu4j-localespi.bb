SUMMARY = "Locale SPI library of icu4j"
DESCRIPTION = "Locale SPI library of icu4j."
LICENSE = "BSD-3-Clause & MIT & Unicode & LicenseRef-SUSE-Public-Domain"

PV = "73.1"

RPM_NAME = "icu4j-localespi-73.1-5.3.noarch.rpm"
RPM_HASH = "eb8c17c1c6087e84f56db5ac9c3c527ce8d3c76fecfa58cb02bb600f3436038373a8f289710c74a70b64eb1edae6c498c288a1cb99e83012df1c0ffbd4fe8bb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icu4j-localespi \
mvn-com.ibm.icu-icu4j-localespi \
mvn-com.ibm.icu-icu4j-localespi-pom- \
osgi-com.ibm.icu.localespi"

RDEPENDS:${PN} += "icu4j \
java-headless \
javapackages-filesystem \
mvn-com.ibm.icu-icu4j"

inherit rpm
