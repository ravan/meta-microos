SUMMARY = "Class Model for Hk2"
DESCRIPTION = "Hundred Kilobytes Kernel Class Model."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.5.0"

RPM_NAME = "glassfish-hk2-class-model-2.5.0-11.6.noarch.rpm"
RPM_HASH = "fa518e13a8a3d39635aaa3fd18e910f7c097bcbab0f529956b331f21ff33fd96bd995d2722f2e5d2ce0c5918b0cf39dfe6a37dbf49454b82a1328e5006e87a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-hk2-class-model \
mvn-org.glassfish.hk2-class-model \
mvn-org.glassfish.hk2-class-model-pom- \
osgi-org.glassfish.hk2.class-model"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.ow2.asm-asm-all"

inherit rpm
