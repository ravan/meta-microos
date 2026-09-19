SUMMARY = "An assertion framework for Java unit tests"
DESCRIPTION = "Truth is a library provides alternative ways to express assertions in \
unit tests. It can be used as a replacement for JUnit's assertions or FEST \
or it can be used alongside where other approaches seem more suitable."
LICENSE = "Apache-2.0"

PV = "0.24"

RPM_NAME = "truth-0.24-4.4.noarch.rpm"
RPM_HASH = "cfa4ed821a58863bfabe5328429a637e905af4d8489ee5f9e0d6f34531e8b3b2d6bafef6e61fb7721fdab36fec652a0000305c07e046758cfd556cd3d7621434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.google.truth-truth \
mvn-com.google.truth-truth-parent-pom- \
mvn-com.google.truth-truth-pom- \
truth"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.auto.value-auto-value-annotations \
mvn-com.google.guava-guava \
mvn-junit-junit"

inherit rpm
