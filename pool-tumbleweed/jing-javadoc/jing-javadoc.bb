SUMMARY = "Javadoc API documentation for Jing"
DESCRIPTION = "Javadoc API documentation for Jing."
LICENSE = "BSD-3-Clause"

PV = "20220510"

RPM_NAME = "jing-javadoc-20220510-5.10.noarch.rpm"
RPM_HASH = "7b82d34d8914a50a70e6da7c0bc05fb5ce21b3843a40f8a220414ddb5b91a09e16acc493a3e84519322bab2620340532bd45bbf3ea935118403bbf88303f48b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jing-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
