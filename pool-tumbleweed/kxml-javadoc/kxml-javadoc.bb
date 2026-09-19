SUMMARY = "Javadoc for kxml"
DESCRIPTION = "API documentation for kxml."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "kxml-javadoc-2.3.0-21.7.noarch.rpm"
RPM_HASH = "c19561af9993755df791e7a2406fcec44618f530ee5454bc3ba73adea0316169dd4819578ec4cc64dbd5bbb29a9d8c7825e4efce29c2badb4bd8d48198857dc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kxml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
