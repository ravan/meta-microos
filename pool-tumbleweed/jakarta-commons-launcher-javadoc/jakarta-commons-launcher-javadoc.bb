SUMMARY = "Javadoc for jakarta-commons-launcher"
DESCRIPTION = "Commons-launcher eliminates the need for a batch or shell script to \
launch a Java class. \
 \
This package contains the javadoc documentation for the Jakarta Commons \
Launcher Package."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "jakarta-commons-launcher-javadoc-1.1-25.18.noarch.rpm"
RPM_HASH = "63451b720a4827edc11aa953c24e57987129c4bdca548086ddb1581d9d53881b40ca3ec96e2a6da2fe424b99fc583391f060f64cb3afbdefcc3533729dc936c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-commons-launcher-javadoc"

RDEPENDS:${PN} += "coreutils"

inherit rpm
