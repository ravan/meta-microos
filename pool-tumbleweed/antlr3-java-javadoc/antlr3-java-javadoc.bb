SUMMARY = "API documentation for antlr3-java"
DESCRIPTION = "API documentation for antlr3-java."
LICENSE = "BSD-3-Clause"

PV = "3.5.3"

RPM_NAME = "antlr3-java-javadoc-3.5.3-8.3.noarch.rpm"
RPM_HASH = "0d3ee8d2ccb58f89a5b691d25a92022e0c92ab8e1ff82d71657732b1dc99167c2c7440a5d89e0b3f06b3ad97352d2aea11cf6ff0a66304d5101f0d175e99de6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr3-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
