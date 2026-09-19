SUMMARY = "Javadoc for pegdown"
DESCRIPTION = "This package contains javadoc for pegdown."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "pegdown-javadoc-1.4.2-3.9.noarch.rpm"
RPM_HASH = "7f0dce70337d0e7519f31adb58184f69063bc07f2bf45058afb2c14d21ce43d154f62254482ebbc4628773631ae2a776e3ad1c24d8625ae58da4b9e4662d260e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pegdown-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
