SUMMARY = "API documentation for maven-shared-jarsigner"
DESCRIPTION = "This package provides API documentation for maven-shared-jarsigner."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-shared-jarsigner-javadoc-3.0.0-4.8.noarch.rpm"
RPM_HASH = "b880529a8f7dda59dd39dde392b689f58aed5b393b98620ff5360548eb4dd3c383777ea1c7b2ce6dcf370dfbfc2625b05082c3f15cc1fcd3760879b6d742078b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-jarsigner-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
