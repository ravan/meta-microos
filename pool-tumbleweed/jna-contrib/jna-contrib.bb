SUMMARY = "Contrib for jna"
DESCRIPTION = "This package contains the contributed examples for jna."
LICENSE = "Apache-2.0 | LGPL-2.1-or-later"

PV = "5.13.0"

RPM_NAME = "jna-contrib-5.13.0-5.6.noarch.rpm"
RPM_HASH = "4b0c1e99273aa2e780802412d68cacfa558ac2d26063593bd9c4eeb4a85780d80c2244b57dabc3a7b92f565230ab9c8d6daaad53f76a24851f4a735b14caaf63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jna-contrib \
jna-platform \
mvn-net.java.dev.jna-jna-platform \
mvn-net.java.dev.jna-jna-platform-jpms \
mvn-net.java.dev.jna-jna-platform-jpms-pom- \
mvn-net.java.dev.jna-jna-platform-pom- \
mvn-net.java.dev.jna-platform \
mvn-net.java.dev.jna-platform-pom- \
osgi-com.sun.jna.platform"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
jna \
mvn-net.java.dev.jna-jna \
osgi-com.sun.jna"

inherit rpm
