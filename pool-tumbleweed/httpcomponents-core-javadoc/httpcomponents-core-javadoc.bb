SUMMARY = "API documentation for httpcomponents-core"
DESCRIPTION = "API documentation for httpcomponents-core."
LICENSE = "Apache-2.0"

PV = "4.4.14"

RPM_NAME = "httpcomponents-core-javadoc-4.4.14-1.7.noarch.rpm"
RPM_HASH = "b8fa3b16692b7bd896eba474bf6dccf8b591fbc3bf49f9f2f7d743433395b75e9106b06702c335c5c4a0296e29aaacf68ae4145eecb85fc493bdeeb1186a24a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
