SUMMARY = "Native I/O access for java"
DESCRIPTION = "Java Native Runtime Enhanced X-platform I/O"
LICENSE = "Apache-2.0 & LGPL-3.0-only"

PV = "0.32.14"

RPM_NAME = "jnr-enxio-0.32.14-2.10.noarch.rpm"
RPM_HASH = "60c2ab70acb33f12e8f9f481e2cd74a36c72e25689c63ec718f49215c1d3dca7ceac2e7faec5e7b9bf772b25d0cdf2412d1814265cbf1fbb17e9a2b635036db3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-enxio \
mvn-com.github.jnr-jnr-enxio \
mvn-com.github.jnr-jnr-enxio-pom- \
osgi-com.github.jnr.enxio"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.jnr-jnr-constants \
mvn-com.github.jnr-jnr-ffi"

inherit rpm
