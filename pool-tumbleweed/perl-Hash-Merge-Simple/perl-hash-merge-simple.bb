SUMMARY = "Recursively merge two or more hashes, simply"
DESCRIPTION = "Hash::Merge::Simple will recursively merge two or more hashes and return \
the result as a new hash reference. The merge function will descend and \
merge hashes that exist under the same node in both the left and right \
hash, but doesn't attempt to combine arrays, objects, scalars, or anything \
else. The rightmost hash also takes precedence, replacing whatever was in \
the left hash if a conflict occurs. \
 \
This code was pretty much taken straight from Catalyst::Utils, and modified \
to handle more than 2 hashes at the same time."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.52.0"

RPM_NAME = "perl-Hash-Merge-Simple-0.52.0-1.10.noarch.rpm"
RPM_HASH = "f0608f32646a55de99a45d748a23f78533882e32a9477a9c117ffab0891b90cd81a2f47599d16099d1c19907e7faa00bab81ff76b2cd4cdea623034cbb33a90f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Hash--Merge--Simple \
perl-Hash-Merge-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Clone"

inherit rpm
