SUMMARY = "QR Code generator library - Java"
DESCRIPTION = "Java implementation of the QR Code generator library"
LICENSE = "MIT"

PV = "1.8.0+git17.856ba8a"

RPM_NAME = "QR-Code-generator-java-1.8.0+git17.856ba8a-3.6.aarch64.rpm"
RPM_HASH = "6dd45a3107e93ee0d3f97a85b7abd2294512797d5f4bd080696513973ca231e45acdc1343b67b707310dd84c977ef209ecca88abc68dd11d000f6e2ec3e5f798"

RPROVIDES:${PN} += "QR-Code-generator-java \
mvn-io.nayuki-qrcodegen \
mvn-io.nayuki-qrcodegen-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
