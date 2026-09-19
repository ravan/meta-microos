SUMMARY = "API documentation for jakarta-pages"
DESCRIPTION = "API documentation for jakarta-pages."
LICENSE = "Apache-2.0 & (EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "4.0.0"

RPM_NAME = "jakarta-pages-javadoc-4.0.0-3.4.noarch.rpm"
RPM_HASH = "2a5be18927664f12f2085b06c320f8eaec3db58c9f7f60e9947e714ab606cf799015a364be55d2c9397f82e9697ba069f4904b26ba039bff64bed71646f05969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-pages-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
