SUMMARY = "API documentation for jakarta-expression-language"
DESCRIPTION = "This package provides API documentation for jakarta-expression-language."
LICENSE = "EPL-2.0"

PV = "6.0.1"

RPM_NAME = "jakarta-expression-language-javadoc-6.0.1-2.6.noarch.rpm"
RPM_HASH = "abff3582b6064304f69ce20dc10d95b314bd9b3ac8bf5d2af7e76ce67a417beef9b5ed6ed3e2bde6b55978fa4c95a1f19b8af9746b3df000dfcd3c7bc0df8ff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-expression-language-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
