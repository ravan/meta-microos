SUMMARY = "Istack-commons soimp"
DESCRIPTION = "This package contains istack-commons soimp."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-soimp-3.0.7-8.10.noarch.rpm"
RPM_HASH = "05eff4a67a75da59820484b52ed0767d421cc42d75efab41f97905909ebc6eadc1f0f373f737199491ce677812f9bf483836a2c7a235185a55b7bfa81a596538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons-soimp \
mvn-com.sun.istack-istack-commons-soimp \
mvn-com.sun.istack-istack-commons-soimp-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-args4j-args4j \
mvn-org.apache.ant-ant"

inherit rpm
