SUMMARY = "Polyglot Tesla :: Common"
DESCRIPTION = "Polyglot Tesla :: Common."
LICENSE = "EPL-1.0"

PV = "0.4.5"

RPM_NAME = "tesla-polyglot-common-0.4.5-2.7.noarch.rpm"
RPM_HASH = "a09ac9658ee78382b24da489a8de03d118804cf9ac6ea5cd4b677880ca54850de0058e90573f4129170ab0ce77b0d53d353088cdf059bf947f3eba6c252926e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-io.takari.polyglot-polyglot-common \
mvn-io.takari.polyglot-polyglot-common-pom- \
mvn-io.takari.polyglot-polyglot-pom- \
mvn-io.tesla.polyglot-tesla-polyglot-common \
mvn-io.tesla.polyglot-tesla-polyglot-common-pom- \
mvn-org.sonatype.pmaven-pmaven-common \
mvn-org.sonatype.pmaven-pmaven-common-pom- \
tesla-polyglot-common"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
