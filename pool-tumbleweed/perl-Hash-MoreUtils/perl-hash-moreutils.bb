SUMMARY = "Provide the stuff missing in Hash::Util"
DESCRIPTION = "Similar to List::MoreUtils, 'Hash::MoreUtils' contains trivial but \
commonly-used functionality for hashes. The primary focus for the moment is \
providing a common API - speeding up by XS is far away at the moment."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.06"

RPM_NAME = "perl-Hash-MoreUtils-0.06-1.32.noarch.rpm"
RPM_HASH = "54757ed47a83c84cedece785fb2992481cc4dedc8d2a9c17d45457c78208d64959eb951842c20a55288d4159937f97d0bfd8795d7084ccebe810e562ee127dad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--MoreUtils \
perl-Hash-MoreUtils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
