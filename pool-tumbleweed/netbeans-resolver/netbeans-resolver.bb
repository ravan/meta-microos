SUMMARY = "Resolver subproject of xml-commons patched for NetBeans"
DESCRIPTION = "Resolver subproject of xml-commons, version 1.2 with \
a patch for NetBeans."
LICENSE = "Apache-1.1"

PV = "6.7.1"

RPM_NAME = "netbeans-resolver-6.7.1-20.10.noarch.rpm"
RPM_HASH = "27f913b8cdfd2cdac615bd8e40a3d0d4918dab142dc634ba9c8ec3bc1c655968e83c3dbb97dac48cbe096b4cabd65058d4ad05ae73d3b210f056fdd9c25553e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netbeans-resolver"

RDEPENDS:${PN} += "java \
javapackages-tools"

inherit rpm
