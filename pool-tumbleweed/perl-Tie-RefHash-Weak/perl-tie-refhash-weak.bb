SUMMARY = "A Tie::RefHash subclass with weakened references in the keys."
DESCRIPTION = "The the Tie::RefHash manpage module can be used to access hashes by \
reference. This is useful when you index by object, for example. \
 \
The problem with the Tie::RefHash manpage, and cross indexing, is that \
sometimes the index should not contain strong references to the objecs. the \
Tie::RefHash manpage's internal structures contain strong references to the \
key, and provide no convenient means to make those references weak. \
 \
This subclass of the Tie::RefHash manpage has weak keys, instead of strong \
ones. The values are left unaltered, and you'll have to make sure there are \
no strong references there yourself."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.09"

RPM_NAME = "perl-Tie-RefHash-Weak-0.09-1.41.noarch.rpm"
RPM_HASH = "c18055c1c63b417281da6bab6a5db05ab5b6ddae9e412251c8f1e0d3687bab58518e5a86ea317ffe78a80f916dacca63daa175c2f13c2a41e619d45f2c9dd184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--RefHash--Weak \
perl-Tie-RefHash-Weak"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Task--Weaken \
perl-Variable--Magic"

inherit rpm
