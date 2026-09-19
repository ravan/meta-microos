SUMMARY = "API documentation for decentxml"
DESCRIPTION = "This package contains the API documentation for decentxml."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "decentxml-javadoc-1.4-5.6.noarch.rpm"
RPM_HASH = "fccb4f385a313b9dc7a98421845c6257bee7f8678f16579267c7863b8336488932df2c86b2dd3cf19dc9819a68e735d2d262076603b6d31bbd664ea792cf4f51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "decentxml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
