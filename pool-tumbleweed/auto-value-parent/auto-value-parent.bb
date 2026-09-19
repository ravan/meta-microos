SUMMARY = "Auto Value Parent"
DESCRIPTION = "Immutable value-type code generation for Java 1.6+."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "auto-value-parent-1.6.1-3.4.noarch.rpm"
RPM_HASH = "e3adcb5e8aa2165e6b36615b05004efccc9a134aa0c54d505d72457e7ef50e9259d2b695c892bfd817fba891e250772f389b5070f25b8ad28cde24781d54202c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "auto-value-parent \
mvn-com.google.auto.value-auto-value-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.auto-auto-parent-pom-"

inherit rpm
