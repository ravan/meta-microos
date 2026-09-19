SUMMARY = "Javadocs for hawtjni-maven-plugin"
DESCRIPTION = "This package contains the API documentation for hawtjni-maven-plugin."
LICENSE = "Apache-2.0 & EPL-1.0 & BSD-3-Clause"

PV = "1.18"

RPM_NAME = "hawtjni-maven-plugin-javadoc-1.18-3.1.noarch.rpm"
RPM_HASH = "5666030e3b532f2a90307898a09e89297a9d939254d76b17f784864637e7effcb79f5290550ea4e3a1cd875f545008f411701f3270db7db98a618a419354fd58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hawtjni-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
