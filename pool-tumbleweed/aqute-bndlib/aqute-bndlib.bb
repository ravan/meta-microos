SUMMARY = "BND library"
DESCRIPTION = "BND library."
LICENSE = "Apache-2.0"

PV = "6.4.1"

RPM_NAME = "aqute-bndlib-6.4.1-7.1.noarch.rpm"
RPM_HASH = "74498f0b5afe1f685ac308e405b62aa02fc57565d28d4ca3e90cb07df18d81e86ff1bf63692d72c8227d237fab91db534e669afe727c83d1faa82e8930414524"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aqute-bndlib \
mvn-biz.aQute-bndlib \
mvn-biz.aQute-bndlib-pom- \
mvn-biz.aQute.bnd-aQute.libg \
mvn-biz.aQute.bnd-aQute.libg-pom- \
mvn-biz.aQute.bnd-biz.aQute.bnd.annotation \
mvn-biz.aQute.bnd-biz.aQute.bnd.annotation-pom- \
mvn-biz.aQute.bnd-biz.aQute.bnd.exporters \
mvn-biz.aQute.bnd-biz.aQute.bnd.exporters-pom- \
mvn-biz.aQute.bnd-biz.aQute.bnd.util \
mvn-biz.aQute.bnd-biz.aQute.bnd.util-pom- \
mvn-biz.aQute.bnd-biz.aQute.bndlib \
mvn-biz.aQute.bnd-biz.aQute.bndlib-pom- \
mvn-biz.aQute.bnd-bndlib \
mvn-biz.aQute.bnd-bndlib-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.osgi-org.osgi.service.subsystem \
mvn-org.osgi-osgi.annotation \
mvn-org.osgi-osgi.cmpn \
mvn-org.osgi-osgi.core \
mvn-org.slf4j-slf4j-api"

inherit rpm
