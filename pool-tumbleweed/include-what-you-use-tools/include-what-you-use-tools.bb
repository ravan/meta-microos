SUMMARY = "Additional tools to use include-what-you-use effectively"
DESCRIPTION = "This package contains additional scripts for using include-what-you-use as automated \
refactoring tool."
LICENSE = "NCSA"

PV = "0.26"

RPM_NAME = "include-what-you-use-tools-0.26-1.4.noarch.rpm"
RPM_HASH = "eaf842b10df3027b29be1c9c834797f3402ce0a2e3acb6295d10aa68a29fe90f00903e8cc735a2c2f5412fc2cf4278f408f5ae1077fb89b7b68199624e229fc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "include-what-you-use-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
include-what-you-use"

inherit rpm
