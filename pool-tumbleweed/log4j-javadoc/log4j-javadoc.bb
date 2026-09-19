SUMMARY = "API documentation for log4j"
DESCRIPTION = "API documentation for log4j."
LICENSE = "Apache-2.0"

PV = "2.26.1"

RPM_NAME = "log4j-javadoc-2.26.1-2.1.noarch.rpm"
RPM_HASH = "67791df5b4e84beccaedb4a68eaff0eba22d8ee4a53ea47f97319212445cbc5e2c566ba4608fadf78317e251aabdbe131a00baae18e3d9c8fc995cc0f32341b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
