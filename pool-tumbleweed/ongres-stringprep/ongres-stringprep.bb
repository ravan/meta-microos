SUMMARY = "Preparation of internationalized strings"
DESCRIPTION = "StringPrep is the preparation of internationalized strings (stringprep, RFC 3454)."
LICENSE = "BSD-2-Clause"

PV = "2.2"

RPM_NAME = "ongres-stringprep-2.2-5.4.noarch.rpm"
RPM_HASH = "a2206927b1e6cf3a0b6cafe1e087d5cafcb697ba35ab5da7844c13488afc0e0970d507090c95217cf97dbb02c1f1367ad8cb5b3f5c2a49f2edf62589bc436f4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.ongres.stringprep-nameprep \
mvn-com.ongres.stringprep-nameprep-pom- \
mvn-com.ongres.stringprep-saslprep \
mvn-com.ongres.stringprep-saslprep-pom- \
mvn-com.ongres.stringprep-stringprep \
mvn-com.ongres.stringprep-stringprep-aggregator-pom- \
mvn-com.ongres.stringprep-stringprep-parent-pom- \
mvn-com.ongres.stringprep-stringprep-pom- \
ongres-stringprep \
ongres-stringprep-parent \
ongres-stringprep-saslprep"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
