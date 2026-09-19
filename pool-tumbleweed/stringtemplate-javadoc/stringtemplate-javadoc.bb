SUMMARY = "API documentation for stringtemplate"
DESCRIPTION = "API documentation for package stringtemplate."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "stringtemplate-javadoc-3.2.1-4.8.noarch.rpm"
RPM_HASH = "d9a9ae50e52c84b09f3ebe41226658890f6689e727bbe39d6d80264fd44640a29d501f8c495b995ae6669b208de92bc70957a92370f85312bf136710905ab839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stringtemplate-javadoc"

RDEPENDS:${PN} += "java-javadoc \
javapackages-filesystem"

inherit rpm
