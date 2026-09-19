SUMMARY = "Printing Profiles Documentation from basICColor"
DESCRIPTION = "Printing profiles according to ISO 12647-2. These are CMYK \
ICC profiles documentation files for ISO Printing conditions."
LICENSE = "Zlib"

PV = "1.2.0"

RPM_NAME = "icc-profiles-basiccolor-printing2009-doc-1.2.0-13.25.noarch.rpm"
RPM_HASH = "9bf5a49703a407a3dd0c2151f630db81ab40d6fff35f1f8ecdb9f84e7377d51633227ad44811e268293c144ce8a56be8124036d6855bd75183255961b454a789"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles-basiccolor-printing2009-doc"

RDEPENDS:${PN} += ""

inherit rpm
