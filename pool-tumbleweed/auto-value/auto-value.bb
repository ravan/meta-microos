SUMMARY = "Auto Value"
DESCRIPTION = "Immutable value-type code generation for Java 1.6+."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-value-1.6.1-3.4.noarch.rpm"
RPM_HASH = "7e57be3957c9145558121ce901ecc2a6534dcf9241c519e6842a3a5dab6c5127192a6b1d5e53ddbeb5887ee729c4877fb45ce348cec2124189df637a771dcc87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-value \
mvn-com.google.auto.value-auto-value \
mvn-com.google.auto.value-auto-value-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.auto-auto-common \
mvn-com.google.guava-guava \
mvn-com.squareup-javapoet"

inherit rpm
