SUMMARY = "Auto Value Annotations"
DESCRIPTION = "Immutable value-type code generation for Java 1.6+."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-value-annotations-1.6.1-3.4.noarch.rpm"
RPM_HASH = "883dcf146c02197f8692b5d9e158541187f1c15f26cf9edabbf68a507c5d7999ebaf750772253a4c6488d82954b7f4ad885c86d8eef5e07c14c74c4f2d08b0ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-value-annotations \
mvn-com.google.auto.value-auto-value-annotations \
mvn-com.google.auto.value-auto-value-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
