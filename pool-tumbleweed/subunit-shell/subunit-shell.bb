SUMMARY = "Shell bindings for subunit"
DESCRIPTION = "Subunit shell bindings.  See the python3-python-subunit package for test \
processing functionality."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.6"

RPM_NAME = "subunit-shell-1.4.6-1.2.noarch.rpm"
RPM_HASH = "ba25a91a44457e599059f690d206e91d2d50c636908a55af218afbacecb1513fbd4e1c23e301c8260802b1a11feec459808db9039e559b0111701f4ea342108d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-subunit-shell \
subunit-shell"

RDEPENDS:${PN} += ""

inherit rpm
