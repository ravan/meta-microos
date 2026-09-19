SUMMARY = "A collection of Swing components"
DESCRIPTION = "SwingX contains a collection of powerful, useful, and just plain fun Swing \
components. Each of the Swing components have been extended, providing \
data-aware functionality out of the box. New useful components have been \
created like the JXDatePicker, JXTaskPane, and JXImagePanel."
LICENSE = "LGPL-2.0-only"

PV = "1.6.5.1"

RPM_NAME = "swingx-1.6.5.1-4.4.noarch.rpm"
RPM_HASH = "2031d80bb2059dd637d1e2c2c55d7b38da294bb9f152ffdd63f473276f0e116a14646b60764bfaa6d69c9f73f6b70872e214a8851bdf502214ef5f33bf5f7093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.swinglabs.swingx-swingx-action \
mvn-org.swinglabs.swingx-swingx-action-pom- \
mvn-org.swinglabs.swingx-swingx-all \
mvn-org.swinglabs.swingx-swingx-all-pom- \
mvn-org.swinglabs.swingx-swingx-autocomplete \
mvn-org.swinglabs.swingx-swingx-autocomplete-pom- \
mvn-org.swinglabs.swingx-swingx-beaninfo \
mvn-org.swinglabs.swingx-swingx-beaninfo-pom- \
mvn-org.swinglabs.swingx-swingx-common \
mvn-org.swinglabs.swingx-swingx-common-pom- \
mvn-org.swinglabs.swingx-swingx-core \
mvn-org.swinglabs.swingx-swingx-core-pom- \
mvn-org.swinglabs.swingx-swingx-graphics \
mvn-org.swinglabs.swingx-swingx-graphics-pom- \
mvn-org.swinglabs.swingx-swingx-mavensupport \
mvn-org.swinglabs.swingx-swingx-mavensupport-pom- \
mvn-org.swinglabs.swingx-swingx-painters \
mvn-org.swinglabs.swingx-swingx-painters-pom- \
mvn-org.swinglabs.swingx-swingx-plaf \
mvn-org.swinglabs.swingx-swingx-plaf-pom- \
mvn-org.swinglabs.swingx-swingx-project-pom- \
swingx"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
