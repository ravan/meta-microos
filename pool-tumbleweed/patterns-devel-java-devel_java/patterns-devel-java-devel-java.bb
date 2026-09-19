SUMMARY = "Java Development"
DESCRIPTION = "Tools and libraries for software development using the Java programming language."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-java-devel_java-20170319-5.20.aarch64.rpm"
RPM_HASH = "13c367a0173b49cab05e5a49918eecf1116fa4be2d48e83bd234cd3c5c92a474b4d747ce207ab8597dadb7fb0fbca6af701b59aabe70268a54a8ac75c2a4272e"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-java-devel-java"

RDEPENDS:${PN} += ""

inherit rpm
