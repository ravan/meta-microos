SUMMARY = "API documentation for jakarta-annotations"
DESCRIPTION = "API documentation for jakarta-annotations."
LICENSE = "EPL-2.0 | GPL-2.0-with-classpath-exception"

PV = "3.0.0"

RPM_NAME = "jakarta-annotations-javadoc-3.0.0-1.6.noarch.rpm"
RPM_HASH = "92e770cc9492d9e5cba94c33c081c4e6438cbdd9e212e09602a3daeb81c66bd189b141093aa97974373faf721c46ae2e29b0852b2bd1a408f15f65b0a2b4e72f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-annotations-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
