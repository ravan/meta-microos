SUMMARY = "Merges arbitrarily deep hashes into a single hash"
DESCRIPTION = "Hash::Merge merges two arbitrarily deep hashes into a single hash. That is, \
at any level, it will add non-conflicting key-value pairs from one hash to \
the other, and follows a set of specific rules when there are key value \
conflicts (as outlined below). The hash is followed recursively, so that \
deeply nested hashes that are at the same level will be merged when the \
parent hashes are merged. *Please note that self-referencing hashes, or \
recursive references, are not handled well by this method.* \
 \
Values in hashes are considered to be either ARRAY references, HASH \
references, or otherwise are treated as SCALARs. By default, the data \
passed to the merge function will be cloned using the Clone module; \
however, if necessary, this behavior can be changed to use as many of the \
original values as possible. (See 'set_clone_behavior')."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.302"

RPM_NAME = "perl-Hash-Merge-0.302-1.29.noarch.rpm"
RPM_HASH = "d007d7cf26567c167efca6e457db0368085f1539f1647a86d6985112f595e1b91e886a071a7f8437e546e03e086be4e9f40109a2c88ff1548a4cedbec1df9ae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--Merge \
perl-Hash-Merge"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Clone--Choose"

inherit rpm
