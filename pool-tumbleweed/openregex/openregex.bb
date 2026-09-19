SUMMARY = "OpenRegex regular expressions library"
DESCRIPTION = "OpenRegex is an efficient and flexible library for running regular expressions \
over sequences of user-defined objects."
LICENSE = "LGPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "openregex-1.1.1-4.6.noarch.rpm"
RPM_HASH = "96c53544c22837192c6c641051876ab2d11841648350114a0fcac88400e6c8242462d95dc7a947cb74e7d30f8937926fa138bd1188bdbdeff777b12f8e7e687f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-edu.washington.cs.knowitall-openregex \
mvn-edu.washington.cs.knowitall-openregex-pom- \
openregex"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.code.findbugs-jsr305 \
mvn-com.google.guava-guava"

inherit rpm
