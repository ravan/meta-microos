SUMMARY = "Java library for code generators"
DESCRIPTION = "CodeModel is a Java library for code generators; it provides a way to \
generate Java programs in a way much nicer than PrintStream.println(). \
This project is a spin-off from the JAXB RI for its schema compiler \
to generate Java source files."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.6"

RPM_NAME = "codemodel-2.6-6.6.noarch.rpm"
RPM_HASH = "ed8e2d7b9f1740af0b5ff5795ab0eb948a6a7e90de2a5aa62c72f244af364cad9eedaf33c3920b607ed2d9bbcb0c9efea396e715245e2e07eed72b2f6b5892a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "codemodel \
mvn-com.sun.codemodel-codemodel \
mvn-com.sun.codemodel-codemodel-annotation-compiler \
mvn-com.sun.codemodel-codemodel-annotation-compiler-pom- \
mvn-com.sun.codemodel-codemodel-pom- \
mvn-com.sun.codemodel-codemodel-project-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
