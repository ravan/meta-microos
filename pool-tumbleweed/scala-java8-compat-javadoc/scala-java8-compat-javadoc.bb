SUMMARY = "Javadoc for scala-java8-compat"
DESCRIPTION = "This package contains javadoc for scala-java8-compat."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "scala-java8-compat-javadoc-1.0.2-2.7.noarch.rpm"
RPM_HASH = "1a6bd5b52568628381815d3231cc0fd437ce25c754442051856d55bc52273c42a88de1d289c5138bc2eb9ca28c64759fa9dbd6ca4a7fbbb6b9f2a6958928cb34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scala-java8-compat-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
