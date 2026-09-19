SUMMARY = "API documentation for brotli-java"
DESCRIPTION = "API documentation for brotli-java."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "brotli-java-javadoc-1.2.0-1.3.noarch.rpm"
RPM_HASH = "dca72a0982dc70305e130da170eef0b2f94ab2a1350ade3ab0456da12439e7d4c904b6483a35bbe13d4c5c4c926a7939e10229cb9390929ae7502f41d86328a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brotli-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
