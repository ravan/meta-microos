SUMMARY = "Linear time regular expression matching in Java"
DESCRIPTION = "RE2 is a regular expression engine that runs in time linear \
in the size of the input. RE2/J is a port of C++ library RE2 \
to pure Java."
LICENSE = "BSD-3-Clause"

PV = "1.8"

RPM_NAME = "re2j-1.8-1.1.noarch.rpm"
RPM_HASH = "1fc07faf2aa822b7a41bbec237633b052859110fb6e1a691ade71a4ed2e66f657fc0c47c7f8f7d8166aa3f8c73c12e6d6fb492d8f527d71e8028170ae754ec6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.google.re2j-re2j \
mvn-com.google.re2j-re2j-pom- \
re2j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
