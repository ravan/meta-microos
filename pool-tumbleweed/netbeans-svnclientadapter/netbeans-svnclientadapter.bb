SUMMARY = "Subversion Client Adapter"
DESCRIPTION = "SVNClientAdapter is a high-level Java API for Subversion."
LICENSE = "Apache-2.0"

PV = "6.7.1"

RPM_NAME = "netbeans-svnclientadapter-6.7.1-23.9.noarch.rpm"
RPM_HASH = "862ec28c0a6d89ddc4c81449a897c14e416238ebecc6880eaa27be83c03e2d1917137bf3d17a4f8c69a1a1b6124689ecc94d2ef7b96a4b4678f09dd320a9c92b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netbeans-svnclientadapter"

RDEPENDS:${PN} += "java \
javapackages-tools \
subversion"

inherit rpm
