SUMMARY = "API documentation for j2objc-annotations"
DESCRIPTION = "This package provides API documentation for j2objc-annotations."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "j2objc-annotations-javadoc-3.0.0-1.6.noarch.rpm"
RPM_HASH = "0d5a9b6cc8d4e39a2096e6b97e3b1d3b7819264b871e3130ec076c0804e3977959653b6cf7b302227340b42d796f95631c7076aa02fb6f53fc9287c4e1aeaed5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "j2objc-annotations-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
