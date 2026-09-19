SUMMARY = "HawtJNI Runtime"
DESCRIPTION = "This package provides API that projects using HawtJNI should build \
against."
LICENSE = "Apache-2.0 & EPL-1.0 & BSD-3-Clause"

PV = "1.18"

RPM_NAME = "hawtjni-runtime-1.18-3.1.aarch64.rpm"
RPM_HASH = "b02f087e1173da616297d25850de64c82428cdd6ceaa466b741059a1807904e1d00dc8643e81eed1ec529d9bd284508f6d679568554e2982d3d1e67a0cd722d1"

RPROVIDES:${PN} += "hawtjni-runtime \
mvn-org.fusesource.hawtjni-hawtjni-runtime \
mvn-org.fusesource.hawtjni-hawtjni-runtime-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
